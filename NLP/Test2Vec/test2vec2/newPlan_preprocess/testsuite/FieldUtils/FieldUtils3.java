package FieldUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FieldUtils3 {

    public static boolean debug = false;

    @Test
    public void FieldUtils1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1501");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1502");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, obj1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1503");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1504");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1505");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0f, "", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1506");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100L, "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1507");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (-1L), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1508");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1509");
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "hi!", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1510");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 1.0d, "", (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1511");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1512");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) false, "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1513");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) "hi!", "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1514");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) (short) -1, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1515");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "", (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1516");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1517");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1518");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '4', "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1519");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "hi!", (java.lang.Object) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1520");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0d, "", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1521");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10L, "hi!", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1522");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1523");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) "hi!", "", (java.lang.Object) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.String.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1524");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1525");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1526");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1527");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1528");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1529");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1530");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1.0f), "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1531");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1532");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) "", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1533");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) -1, (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1534");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1535");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1536");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1537");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) 0, "", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1538");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0d, "", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1539");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1540");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1541");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1542");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 'a', "", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1543");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1544");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 100.0f, "", (java.lang.Object) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1545");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1546");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '4', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1547");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 'a', "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1548");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "", (java.lang.Object) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1549");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1550");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "hi!", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1551");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1552");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 100L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1553");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1554");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1555");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1556");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0.0d, "", (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1557");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1558");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1559");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) fieldUtils0, "hi!", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1560");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1561");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100L, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1562");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 1.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1563");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1564");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1.0d, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1565");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils1 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass2 = fieldUtils1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1566");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (byte) 1, (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1567");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1568");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1569");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) true, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1570");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) '4', "", obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1571");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "hi!", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1572");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1573");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1), "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1574");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1575");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1576");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0d), "", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1577");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) -1, "hi!", (java.lang.Object) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1578");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1579");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 10, "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1580");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0f), (java.lang.Object) fieldUtils2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1581");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1582");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1583");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass1 = fieldUtils0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1584");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 1L, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1585");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "hi!", (java.lang.Object) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1586");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0.0f, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1587");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (-1L), "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1588");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0f, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1589");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) true, "hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1590");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) '4', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1591");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) '#', "hi!", (java.lang.Object) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1592");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, obj1, (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1593");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1594");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) 10.0d, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1595");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField(field0, (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1596");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj2 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1597");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1598");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1599");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (-1.0d), "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1600");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1601");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10.0f, "hi!", (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1602");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10L, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1603");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1604");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 100.0d, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1605");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1606");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        java.lang.Class<?> wildcardClass3 = fieldUtils2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1607");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1608");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1609");
        java.lang.reflect.Field field0 = null;
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils2 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, (java.lang.Object) fieldUtils2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1610");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1.0d), (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1611");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1612");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) true, "", (java.lang.Object) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Boolean.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1613");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) ' ', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1614");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) (short) 100, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1615");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1616");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (-1.0f), "", (java.lang.Object) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1617");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1618");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1619");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) 0L, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field  on class java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1620");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1621");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 0L, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1622");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1623");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 0, "", (java.lang.Object) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1624");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) 10, "", (java.lang.Object) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1625");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1626");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (byte) -1, "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1627");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10, (java.lang.Object) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1628");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(obj0, "", (java.lang.Object) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1629");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 100, "hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1630");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) 10L, "hi!", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1631");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 10.0f, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1632");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: target object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1633");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField((java.lang.Object) '4', "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1634");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field0, (java.lang.Object) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1635");
        java.lang.reflect.Field field0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1636");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0.0f, (java.lang.Object) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1637");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1638");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 0L, (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1639");
        org.apache.commons.lang3.reflect.FieldUtils fieldUtils0 = new org.apache.commons.lang3.reflect.FieldUtils();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) fieldUtils0, "", (java.lang.Object) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field org.apache.commons.lang3.reflect.FieldUtils.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1640");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) false, (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1641");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            java.lang.Object obj3 = org.apache.commons.lang3.reflect.FieldUtils.readField((java.lang.Object) ' ', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate field hi! on class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1642");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(obj0, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Object.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1643");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (byte) 1, "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Byte.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1644");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0f, "hi!", (java.lang.Object) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1645");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) ' ', "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Character.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1646");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 1, (java.lang.Object) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1647");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1648");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1L, "", (java.lang.Object) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Long.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1649");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (-1), (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1650");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) (short) 100, (java.lang.Object) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1651");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Integer.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1652");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1653");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) true, (java.lang.Object) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1654");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) 1, "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1655");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) (short) -1, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1656");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 1.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1657");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) 10.0f, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1658");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 100.0d, "", (java.lang.Object) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Double.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1659");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField((java.lang.Object) (short) -1, "", (java.lang.Object) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Short.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1660");
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField((java.lang.Object) 1.0f, "", (java.lang.Object) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot locate declared field java.lang.Float.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void FieldUtils1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1661");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in FieldUtils generation
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
    public void FieldUtils1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FieldUtils3.FieldUtils1662");
        java.lang.reflect.Field field0 = null;
        // The following exception was thrown during execution in FieldUtils generation
        try {
            org.apache.commons.lang3.reflect.FieldUtils.writeField(field0, (java.lang.Object) "", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

