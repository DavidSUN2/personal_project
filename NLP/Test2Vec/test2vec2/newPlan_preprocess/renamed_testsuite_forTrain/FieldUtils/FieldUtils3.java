
package FieldUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FieldUtils3 {

    public static boolean debug = false;

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1501");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1502");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1503");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1505");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1506");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1508");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1509");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1512");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1515");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "", (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1516");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1517");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1519");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "hi!", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1520");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1521");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "hi!", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1522");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1524");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1525");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) fieldUtils1, (java.lang.Object) (-1));
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
            System.out.format("%n%s%n", "FieldUtils3.test1526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1527");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1529");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1531");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1533");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1534");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1535");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1537");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 0, "", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1539");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1540");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1542");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1551");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1553");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1554");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1555");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) wildcardClass1, "", false);
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
            System.out.format("%n%s%n", "FieldUtils3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1557");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1558");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", (java.lang.Object) 0, true);
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
            System.out.format("%n%s%n", "FieldUtils3.test1559");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1560");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1561");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1563");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) wildcardClass1, "hi!", (java.lang.Object) '#', false);
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
            System.out.format("%n%s%n", "FieldUtils3.test1564");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1565");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) fieldUtils1);
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
            System.out.format("%n%s%n", "FieldUtils3.test1566");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1567");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1568");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1569");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1570");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1571");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1572");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1575");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) (byte) 0, true);
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
            System.out.format("%n%s%n", "FieldUtils3.test1576");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1577");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1578");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1580");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1581");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1583");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) wildcardClass1, "", (java.lang.Object) (short) -1);
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
            System.out.format("%n%s%n", "FieldUtils3.test1584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1585");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1586");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1587");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1590");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1591");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "hi!", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1592");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1595");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1596");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1597");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1598");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0d), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1600");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1601");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1602");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1603");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1604");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1605");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1606");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1607");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1609");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1610");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1611");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1613");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1615");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1617");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1618");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1620");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1621");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1622");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1623");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1624");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1626");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1627");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1628");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1629");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "hi!", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1632");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) '4', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1634");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1635");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) wildcardClass3);
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
            System.out.format("%n%s%n", "FieldUtils3.test1636");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1637");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(obj0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1638");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1639");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1640");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1642");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1643");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1645");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1646");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1647");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1649");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1650");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 100, (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1652");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1653");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) true, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1655");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1656");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1657");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1658");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "", (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1660");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1661");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void FieldUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.test1662");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

