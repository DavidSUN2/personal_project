
package HashCodeBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HashCodeBuilder0 {

    public static boolean debug = false;

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test001");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0.0f, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test003");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) '#', (int) (byte) 10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test004");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        float[] floatArray7 = new float[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(floatArray7);
        java.lang.Integer int9 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 932262 + "'", int9.equals(932262));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test005");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 10, (int) '4', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test006");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray7 = new double[] { (short) 0, (byte) 0 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test008");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test009");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray7 = new boolean[] { false, true, true, false };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test010");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100.0f, strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120404085 + "'", int2 == 1120404085);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test011");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 1, 1120404085, (java.lang.Object) "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1120404085 + "'", int4 == 1120404085);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test012");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, 10, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test013");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        char[] charArray7 = new char[] { 'a', '4', '#', '#', '#', '#' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test014");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) 'a', (int) (byte) 100, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 664);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test016");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test017");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 628 + "'", int6 == 628);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test018");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test019");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(664, 0, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test020");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 885741 + "'", int8 == 885741);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test021");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test022");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder3.append((short) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder3.append(objArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(objArray6);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test023");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test024");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test025");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test026");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append((long) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test027");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 100, (int) (short) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test028");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(664, 0, (java.lang.Object) 681);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test030");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1), (int) (byte) 0, (java.lang.Object) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test031");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test032");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 664 + "'", int6 == 664);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test033");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test034");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 630 + "'", int2 == 630);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test035");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder3.append((short) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder3.append(objArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(objArray6);
        int int9 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 681 + "'", int9 == 681);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test036");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((float) 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test037");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test038");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932262 + "'", int7.equals(932262));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test039");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder1 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder1.append((short) (byte) 0);
        boolean[] booleanArray7 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder3.append(booleanArray7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test040");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 681, (java.util.Collection<java.lang.String>) strList5);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) "", (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1310 + "'", int8 == 1310);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 629 + "'", int9 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test041");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) 'a', 23902);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test042");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(100, 885741, (java.lang.Object) hashCodeBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test043");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(664, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test044");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 681, (java.util.Collection<java.lang.String>) strList5);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 630, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1310 + "'", int8 == 1310);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1259 + "'", int9 == 1259);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test045");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        java.lang.Class<?> wildcardClass7 = shortArray5.getClass();
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) shortArray5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23902, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test048");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        java.lang.Class<?> wildcardClass6 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test049");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, (java.util.Collection<java.lang.String>) strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test050");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        long[] longArray7 = new long[] { (byte) 10, 932262, (short) 100, 1L, 1, 100L };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(longArray7);
        java.lang.Class<?> wildcardClass9 = longArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test051");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        boolean[] booleanArray8 = new boolean[] { true, false, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test052");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(681, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test055");
        int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) 'a', (-1074789771), (java.lang.Object) 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1175392055) + "'", int3 == (-1175392055));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test056");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test057");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932289 + "'", int7.equals(932289));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test058");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(objArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(23274, (-1), (java.lang.Object) objArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test059");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(byteArray5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 47925 + "'", int8 == 47925);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test060");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        short[] shortArray8 = new short[] { (byte) 1, (byte) 0, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test061");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        short[] shortArray8 = new short[] { (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test063");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((java.lang.Object) (-1));
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1), 47925, (java.lang.Object) hashCodeBuilder4, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1999958168 + "'", int8 == 1999958168);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test064");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test065");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) 10, (-1175392055));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test067");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        char[] charArray6 = new char[] { '#', '4', '4' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(charArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append(630);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test068");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.appendSuper(629);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48544 + "'", int9 == 48544);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test069");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1120404085);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 1);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-489694039) + "'", int9.equals((-489694039)));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test070");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append((long) 629);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48544 + "'", int9 == 48544);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test072");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, (int) '#', (java.lang.Object) 1065353845);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test073");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) -1, strArray6);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj1, strArray6);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 628 + "'", int7 == 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 729 + "'", int9 == 729);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test074");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        int[] intArray7 = new int[] { (short) -1, 1 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(intArray7);
        java.lang.Integer int9 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34494657 + "'", int9.equals(34494657));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test075");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test076");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append((long) 629);
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test077");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(100, 48544, (java.lang.Object) hashCodeBuilder4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test078");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test079");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1120404085, 1065353845, (java.lang.Object) 729, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 451808338 + "'", int4 == 451808338);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test080");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 729 + "'", int2 == 729);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test081");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1120404085);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((java.lang.Object) "");
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test082");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder1 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder1.appendSuper((int) '4');
        char[] charArray7 = new char[] { '#', '4', '4' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder1.append(charArray7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test083");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.appendSuper(629);
        int int8 = hashCodeBuilder7.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23902 + "'", int8 == 23902);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test084");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int7 = hashCodeBuilder6.toHashCode();
        double[] doubleArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861099 + "'", int7 == 861099);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test085");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder3.append((short) (byte) 0);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder3.append(objArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(objArray6);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 681 + "'", int9 == 681);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test086");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        java.util.Collection<java.lang.String> strCollection7 = null;
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) false, strCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1866 + "'", int8 == 1866);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test087");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(false);
        int int7 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861102 + "'", int7 == 861102);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test088");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) int3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1258 + "'", int5 == 1258);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test089");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test090");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31886748 + "'", int9 == 31886748);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test091");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(1.0f);
        int int7 = hashCodeBuilder4.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append((double) 932918);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1065353845 + "'", int7 == 1065353845);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test092");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) 0);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) int7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 861730 + "'", int9 == 861730);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test093");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(1.0f);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1065353845 + "'", int7.equals(1065353845));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1065377081 + "'", int9 == 1065377081);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test094");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((float) 664);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932918 + "'", int7.equals(932918));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 1999958168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test096");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(628);
        java.lang.Integer int9 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31861291 + "'", int9.equals(31861291));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test097");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(629);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(664, (int) 'a', (java.lang.Object) hashCodeBuilder6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test098");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test099");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper(629);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1259, (int) '4', (java.lang.Object) hashCodeBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test100");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0d);
        java.util.Collection<java.lang.String> strCollection7 = null;
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, strCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 885743 + "'", int8 == 885743);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test101");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1120404085);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 1);
        int int9 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-489694039) + "'", int9 == (-489694039));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test102");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100);
        short[] shortArray8 = new short[] { (short) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test103");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        double[] doubleArray7 = new double[] { 100.0d, 10L };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(doubleArray7);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test104");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1999958168, 0, (java.lang.Object) hashCodeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1258, 885741);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test106");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        java.lang.Integer int8 = hashCodeBuilder7.build();
        java.lang.Integer int9 = hashCodeBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31862106 + "'", int8.equals(31862106));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31862106 + "'", int9.equals(31862106));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test107");
        int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(681, (int) (byte) 1, (java.lang.Object) 630);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test108");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(1.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) ' ', 681, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23273, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test110");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(doubleArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((float) 31862106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test111");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        char[] charArray8 = new char[] { ' ', ' ', 'a', 'a' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23902, 628);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test113");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) -1, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) -1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 628 + "'", int5 == 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 628 + "'", int7 == 628);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test114");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 10, (-1074789771));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((-1175392055), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test116");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 34494657, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34495286 + "'", int8 == 34495286);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test117");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        float[] floatArray7 = new float[] { (-1L), (-1) };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(floatArray7);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1860590971 + "'", int9 == 1860590971);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test118");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test119");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((float) (short) -1);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1047635739) + "'", int9.equals((-1047635739)));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test120");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 861101);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test121");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1120404085);
        long[] longArray7 = new long[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(longArray7);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test122");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(932918);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test123");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 932262);
        int int7 = hashCodeBuilder6.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1232125416 + "'", int7 == 1232125416);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test124");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(objArray5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) objArray5, false);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(48544, 628, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test125");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1860 + "'", int2 == 1860);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test126");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        java.lang.Class<?> wildcardClass5 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test127");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(17, 47925, (java.lang.Object) (short) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 814735 + "'", int4 == 814735);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test128");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(obj5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 10, 932262, (java.lang.Object) hashCodeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test129");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test130");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder0, strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25271 + "'", int9 == 25271);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test131");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append((long) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append((float) 1310);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test132");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(doubleArray6);
        java.lang.Integer int8 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1073554312 + "'", int8.equals(1073554312));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test133");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('#');
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34518001 + "'", int9 == 34518001);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test134");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(729);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 729);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1232125416, 861101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test136");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 0, 1065353845, (java.lang.Object) 23273, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test137");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 681, (java.util.Collection<java.lang.String>) strList5);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 31862106, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1310 + "'", int8 == 1310);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31862735 + "'", int9 == 31862735);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test138");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        char[] charArray6 = new char[] { '#', '4', '4' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(charArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test139");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(1.0f);
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(intArray7);
        int int9 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1065353845 + "'", int9 == 1065353845);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885743, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test141");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((double) 861730);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test142");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 25271, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25900 + "'", int2 == 25900);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test143");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(1999958168);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000819639 + "'", int9 == 2000819639);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test144");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) 0);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        java.lang.Integer int8 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 861101 + "'", int8.equals(861101));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test145");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test146");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test147");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((short) (byte) 100);
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test148");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 932262);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test149");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((double) 1065377081);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test150");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        int int5 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-529) + "'", int5 == (-529));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test151");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test152");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(1.0f);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1.0f, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1065353845 + "'", int8 == 1065353845);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test153");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(729);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper(681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test154");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 31861291);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test155");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(861730, 1092616821);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test156");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        float[] floatArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(floatArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test157");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (short) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test158");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(23274, (-619), obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test159");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(booleanArray5);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test160");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test161");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test162");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932262, (int) ' ', (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test163");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1073554312);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 1866);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test166");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper(1860590971);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test167");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0);
        int[] intArray8 = new int[] { ' ' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test168");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1866 + "'", int2 == 1866);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test169");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) 0);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        float[] floatArray8 = new float[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test170");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861099 + "'", int7.equals(861099));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test171");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100.0f, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120404085 + "'", int2 == 1120404085);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test172");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((float) 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test173");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(1065353845);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test174");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test175");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test176");
        java.lang.Object obj0 = new java.lang.Object();
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test177");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1047635739), (int) ' ', (java.lang.Object) hashCodeBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test178");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int7 = hashCodeBuilder6.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(48544);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861099 + "'", int7 == 861099);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test179");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(1232125416);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test180");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test181");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test182");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test184");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        int int7 = hashCodeBuilder4.toHashCode();
        java.lang.Class<?> wildcardClass8 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23274 + "'", int7 == 23274);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test185");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23274 + "'", int7.equals(23274));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test186");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(25271);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test187");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 0);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1310933902 + "'", int9.equals(1310933902));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test188");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 932262);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((float) 31861291);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test189");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(1259);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test190");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(true);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(681, (-529), (java.lang.Object) true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-359018) + "'", int8 == (-359018));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test191");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test192");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test193");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, (int) 'a', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test194");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test195");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 10);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31860784 + "'", int9.equals(31860784));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test196");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 48544);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102604171 + "'", int9.equals(102604171));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test197");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(25271);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test198");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((byte) -1);
        java.lang.Integer int8 = hashCodeBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 932288 + "'", int8.equals(932288));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test199");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 861101, strArray1);
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 861101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 861730 + "'", int2 == 861730);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 861730 + "'", int4 == 861730);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test200");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        int int7 = hashCodeBuilder4.toHashCode();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932288, (-359018), (java.lang.Object) hashCodeBuilder4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-629) + "'", int7 == (-629));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test201");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 861101);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33586528 + "'", int9 == 33586528);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test202");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test203");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((short) (byte) 1);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(31862735, 31862735, (java.lang.Object) hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-888614648) + "'", int9 == (-888614648));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test204");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, true);
        java.lang.Integer int9 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48015 + "'", int8 == 48015);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23373 + "'", int9.equals(23373));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test205");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int7 = hashCodeBuilder6.toHashCode();
        java.lang.Integer int8 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861099 + "'", int7 == 861099);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 861099 + "'", int8.equals(861099));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932288, 34495286, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test207");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((int) (short) 0);
        java.lang.Integer int9 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34517966 + "'", int9.equals(34517966));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test208");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-529), false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test209");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test210");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(932289);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test211");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(861102, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test213");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (short) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test214");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) (short) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test215");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 10);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1092616821 + "'", int7.equals(1092616821));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test216");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1.0d), (java.util.Collection<java.lang.String>) strList4);
        java.lang.Class<?> wildcardClass8 = strList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 629 + "'", int6 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1074789771) + "'", int7 == (-1074789771));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test217");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-629), 1860590971, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test218");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', strArray7);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (short) 0, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 664 + "'", int8 == 664);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 629 + "'", int9 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test219");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 932262);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.appendSuper(34495286);
        int int9 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1621504578) + "'", int9 == (-1621504578));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test220");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1860590971, 628, (java.lang.Object) 681, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test221");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(25271);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 814735);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23373, 1073554312);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test223");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        float[] floatArray6 = new float[] { 1999958168 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test224");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(byteArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test225");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 10, 17, (java.lang.Object) 34495286, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test226");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, (int) (short) 1);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test227");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(byteArray7);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test228");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('a');
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, true);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 909113 + "'", int8 == 909113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test229");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(1232125416);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1232126045 + "'", int7.equals(1232126045));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test230");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        float[] floatArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(floatArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.appendSuper((-629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test231");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) (short) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((byte) 0);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1074789871 + "'", int9 == 1074789871);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test232");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        int[] intArray4 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(intArray4);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(objArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((float) 34495286);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test233");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        char[] charArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(charArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1L);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(23373, (-1074789771), (java.lang.Object) hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 515660539 + "'", int9 == 515660539);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test234");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31862735, (-489694039));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test235");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 664 + "'", int8 == 664);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test236");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861064 + "'", int7.equals(861064));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31886748, 1065377081);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test238");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int7 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861099 + "'", int7 == 861099);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test239");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        long[] longArray4 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(longArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test240");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        int int5 = hashCodeBuilder4.toHashCode();
        java.lang.Class<?> wildcardClass6 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23273 + "'", int5 == 23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test241");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((long) 23902);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test242");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        float[] floatArray7 = new float[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(floatArray7);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test243");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        int int8 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23274 + "'", int7.equals(23274));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23274 + "'", int8 == 23274);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test244");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) 0);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((long) (-1175392055));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test245");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(byteArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((double) 25900);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test246");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test247");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test248");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test249");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 1065377081);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test250");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 100);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1290437715 + "'", int8 == 1290437715);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test251");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('a');
        java.lang.Integer int7 = hashCodeBuilder6.build();
        java.lang.Class<?> wildcardClass8 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 884471 + "'", int7.equals(884471));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test252");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 1065353845);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1311, (-489694039), (java.lang.Object) hashCodeBuilder4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.appendSuper(515660539);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1691353211 + "'", int7 == 1691353211);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test253");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 0L);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test254");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test255");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932918, 1691353211, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test256");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31886748, 23273);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test257");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test258");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper(1358);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test259");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100L, (java.util.Collection<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, (java.util.Collection<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 729 + "'", int7 == 729);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test260");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(byteArray7);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-666410032) + "'", int9.equals((-666410032)));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test261");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(doubleArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test262");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((int) (short) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 10);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31860784 + "'", int9 == 31860784);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test263");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(34518001, 31862735);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test264");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test265");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) (short) -1);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1074789871) + "'", int7.equals((-1074789871)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test266");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test267");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 10);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(objArray7);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23283 + "'", int9 == 23283);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test268");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 515660539);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test269");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(1232125416);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1232126045 + "'", int7.equals(1232126045));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test270");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 629);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1358, (int) (byte) -1, (java.lang.Object) hashCodeBuilder4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test271");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(23274, 1691353211, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test272");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((-1175392055));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test273");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 34495286);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test274");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23274, 451808338);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test275");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList3);
        java.lang.Class<?> wildcardClass6 = strList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test276");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((byte) 100);
        java.lang.Integer int9 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34496088 + "'", int9.equals(34496088));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test277");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test278");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test279");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test280");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test281");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23373, 1065353845);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test282");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder3.append((float) 1310);
        long[] longArray7 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder5.append(longArray7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test283");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder5.appendSuper(102604171);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test284");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test285");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1.0d), (java.util.Collection<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, (java.util.Collection<java.lang.String>) strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1074789771) + "'", int8 == (-1074789771));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test286");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        long[] longArray4 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(longArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 861101, strArray7);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) longArray4, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 861730 + "'", int8 == 861730);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test287");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1065353845, 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) (short) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 34518001);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(48544);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test288");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        char[] charArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(charArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1L);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test289");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34517966 + "'", int9 == 34517966);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test290");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(25271);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1290462886 + "'", int8 == 1290462886);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test291");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, 861064);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test292");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test293");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        char[] charArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(charArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 1, (int) (byte) 100, (java.lang.Object) hashCodeBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test294");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 34495286);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test295");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((byte) 100);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test296");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(' ');
        int int8 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23305 + "'", int8 == 23305);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test297");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        long[] longArray4 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(longArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test298");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((long) 451808338);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test299");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        double[] doubleArray7 = new double[] { 1860, 31861291 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test300");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((java.lang.Object) 100.0f);
        java.lang.Integer int9 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152264119 + "'", int9.equals(1152264119));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test301");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, 932918);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test302");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) (short) -1);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(23273, 885743, (java.lang.Object) hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-892709077) + "'", int9 == (-892709077));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test303");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(doubleArray6);
        java.util.Collection<java.lang.String> strCollection8 = null;
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, strCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1073578954 + "'", int9 == 1073578954);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test304");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test305");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test306");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        char[] charArray6 = new char[] { '#', '4', '4' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(charArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test307");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1310);
        long[] longArray6 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1310, 1358, (java.lang.Object) hashCodeBuilder7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test308");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(byteArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper(48015);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test309");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 861101, strArray3);
        int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1358, strArray3);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1860, strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 861730 + "'", int4 == 861730);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1987 + "'", int5 == 1987);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2489 + "'", int6 == 2489);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test310");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(729);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(31860784, 1866, (java.lang.Object) 729);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test311");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('a');
        java.lang.Integer int7 = hashCodeBuilder6.build();
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) int7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 884471 + "'", int7.equals(884471));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 885100 + "'", int9 == 885100);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test312");
        int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(909113, 885743, (java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2081591608 + "'", int3 == 2081591608);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test313");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47915 + "'", int6 == 47915);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test314");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 1310933902);
        int int9 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1342796563 + "'", int9 == 1342796563);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test315");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 0);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34517966 + "'", int9.equals(34517966));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test316");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 861730);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test317");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 729, (java.util.Collection<java.lang.String>) strList4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 23273, (java.util.Collection<java.lang.String>) strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1358 + "'", int6 == 1358);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23902 + "'", int7 == 23902);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test318");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0d);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test319");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, (int) (short) 1);
        int int3 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test320");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(1.0f);
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(intArray7);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1065353845 + "'", int9.equals(1065353845));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test321");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        java.lang.Integer int5 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23273 + "'", int5.equals(23273));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test322");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(34517966);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test323");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1860, 451808338, (java.lang.Object) hashCodeBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test324");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(628, 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test325");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.appendSuper(629);
        java.lang.Integer int8 = hashCodeBuilder0.build();
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23902 + "'", int8.equals(23902));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test326");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.appendSuper(1310933902);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test327");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) 0);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7.equals(861101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test328");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(1065353845, 1065353845);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(34495286, 1987, (java.lang.Object) 1065353845);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test329");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test330");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(885741);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((float) (byte) 100);
        java.lang.Integer int9 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1187670566 + "'", int9.equals(1187670566));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test331");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932262, 1187670566, (java.lang.Object) (-892709077));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test332");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(' ');
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test333");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        int int5 = hashCodeBuilder4.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23273 + "'", int5 == 23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test334");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((float) 25900);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(35430646, 1987);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test336");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test337");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append((double) 932289);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test338");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, 31862106);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test339");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1074789871, 909113, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test340");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 861101);
        java.lang.Integer int9 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33586528 + "'", int9.equals(33586528));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test341");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((long) 100);
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test342");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        float[] floatArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(floatArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test343");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Class<?> wildcardClass5 = objArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test344");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 34495286);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(1065353845);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 687260627 + "'", int9.equals(687260627));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test345");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test346");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(true);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34495988 + "'", int9.equals(34495988));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test347");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        int int8 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932289 + "'", int7.equals(932289));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 932289 + "'", int8 == 932289);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test348");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((long) 932262);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861099 + "'", int7.equals(861099));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test349");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((-1074789771));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(629, 31860784, (java.lang.Object) hashCodeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test350");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(1987);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test351");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) 885743);
        java.lang.Integer int6 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1230543321 + "'", int6.equals(1230543321));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test352");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(byteArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((float) 1999958168);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test353");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((long) 100);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 719 + "'", int7.equals(719));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test354");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25271 + "'", int5 == 25271);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test355");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(booleanArray7);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test356");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', strArray6);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1), strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 664 + "'", int7 == 664);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 628 + "'", int8 == 628);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test357");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885743, (int) (short) 1);
        short[] shortArray8 = new short[] { (short) -1, (byte) 10, (byte) 1, (short) 10, (short) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test358");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((long) 1999958168);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100.0d);
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test359");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test360");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        float[] floatArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(floatArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-629) + "'", int9 == (-629));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test361");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(2081591608, 628);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (-529));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test363");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 932262);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test364");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1074789871, (-619));
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test365");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 1, 932262, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test366");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1), 33586528, (java.lang.Object) 1152264119);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test367");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((long) 451808338);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test368");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(byteArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper(664);
        int int9 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1938219936 + "'", int9 == 1938219936);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test369");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 932262);
        int int7 = hashCodeBuilder6.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1232125416 + "'", int7 == 1232125416);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test370");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, (-1074789871), (java.lang.Object) hashCodeBuilder6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test371");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) longArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test372");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(byteArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 885743);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test373");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((long) 100);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test374");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((double) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(909113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test375");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        java.lang.Integer int1 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1.equals(17));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test376");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(34494657, 34494657, (java.lang.Object) (byte) -1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-673103488) + "'", int4 == (-673103488));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test377");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(885743, 23283, (java.lang.Object) 35430646, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-816651565) + "'", int4 == (-816651565));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test378");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 10, 31862106, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test379");
        java.util.Collection<java.lang.String> strCollection1 = null;
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 861730, strCollection1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 862359 + "'", int2 == 862359);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test380");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) (short) -1);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((float) 34517966);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1074789871) + "'", int7.equals((-1074789871)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test381");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        int int5 = hashCodeBuilder4.toHashCode();
        int int6 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23273 + "'", int5 == 23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23273 + "'", int6 == 23273);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test382");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test383");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(814735);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test384");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test385");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, 31862106);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test386");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.appendSuper(451808338);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test387");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 10);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        double[] doubleArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1092616821 + "'", int7.equals(1092616821));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test388");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 34495286);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test389");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test390");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        char[] charArray7 = new char[] { 'a', '4', '#', '#', '#', '#' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(charArray7);
        int int9 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1096616298) + "'", int9 == (-1096616298));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test391");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((byte) 100);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34496088 + "'", int9 == 34496088);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test392");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(515660539, 1691353211);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test393");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(862359, 630);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test394");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test395");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1120404085);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) (byte) -1);
        int int9 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-489694041) + "'", int9 == (-489694041));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test396");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(729);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861830 + "'", int7.equals(861830));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test397");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(byteArray4);
        float[] floatArray6 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test398");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        short[] shortArray7 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(shortArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1232125416, 0, (java.lang.Object) hashCodeBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test399");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.appendSuper(1152264119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test400");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 34494657, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34495286 + "'", int2 == 34495286);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test401");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = hashCodeBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test402");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(885741);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((long) 1232126045);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1299393155 + "'", int9.equals(1299393155));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test403");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(byteArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((float) 687260627);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test404");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(1987);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-341106004) + "'", int5.equals((-341106004)));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test405");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 34518001);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(630, 2081591608);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test407");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) 909113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test408");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((short) (byte) 0);
        java.lang.Class<?> wildcardClass8 = hashCodeBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test409");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((-1L));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test410");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((long) 48544);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test411");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(48544, 729);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test412");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        int int7 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 861101 + "'", int7 == 861101);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test413");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder5.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test414");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(booleanArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test415");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((byte) 0);
        int int8 = hashCodeBuilder2.toHashCode();
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 932289 + "'", int8 == 932289);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test416");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder((-629), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(814735, 1232125416, (java.lang.Object) (-629), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test417");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) 10);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test418");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 729);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test419");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(25271);
        float[] floatArray8 = new float[] { (short) 0 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test420");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((double) 1);
        java.lang.Integer int8 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1073625537 + "'", int8.equals(1073625537));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test421");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(1232125416);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) 100);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1232125945) + "'", int9 == (-1232125945));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test422");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(34518001, 1187670566);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test423");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.appendSuper(2000819639);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test424");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1065353845, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1065354474 + "'", int2 == 1065354474);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test425");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        char[] charArray6 = new char[] { '#', '4', '4' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(charArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((double) 1073625537);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test426");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(' ');
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test427");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(25271);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((short) (byte) -1);
        java.lang.Integer int9 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 501574771 + "'", int9.equals(501574771));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test428");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(booleanArray5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder6, true);
        java.lang.Integer int9 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 886113 + "'", int8 == 886113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 861471 + "'", int9.equals(861471));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test429");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder5.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test430");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1.0d, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693877 + "'", int2 == 1072693877);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test431");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '#', 34494657);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test432");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        int int7 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932262 + "'", int7 == 932262);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test433");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 31862106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test434");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        java.lang.Integer int5 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25197 + "'", int5.equals(25197));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test435");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) int5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test436");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper(1065377081);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test437");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        float[] floatArray7 = new float[] { (-1L), (-1) };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(floatArray7);
        int int9 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1860590971 + "'", int9 == 1860590971);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test438");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) 100);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test439");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) (-1.0f));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((-673103488));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test440");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append('#');
        java.lang.Integer int5 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90432068 + "'", int5.equals(90432068));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test441");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        int int5 = hashCodeBuilder4.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23273 + "'", int5 == 23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test442");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(false);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1866 + "'", int9 == 1866);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test443");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper(1065377081);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test444");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Integer int3 = hashCodeBuilder0.build();
        java.lang.Integer int4 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 629 + "'", int4.equals(629));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test445");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) 0, (-619));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test446");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test447");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 885100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test448");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((float) 47925);
        java.lang.Integer int9 = hashCodeBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1226926965 + "'", int9.equals(1226926965));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test449");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test450");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test451");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper(885100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test452");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test453");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(1987);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test454");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(doubleArray6);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) doubleArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test455");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1299393155, 729);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test456");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (-1096616298));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test457");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test458");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(629);
        short[] shortArray6 = new short[] { (byte) 0 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(shortArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test459");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder5.append((double) 90432068);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test460");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(1.0f);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1065353845 + "'", int7.equals(1065353845));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test461");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 23373);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test462");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1232125416, 501574771);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test463");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 1065353845);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) '4', 861830, (java.lang.Object) hashCodeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test464");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(861471, (int) (short) 10, (java.lang.Object) 1187670566);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test465");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        char[] charArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(charArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 1L);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1073578991 + "'", int8 == 1073578991);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test466");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, (java.util.Collection<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-199459345) + "'", int9 == (-199459345));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test467");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1074789871, 1258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test468");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(909113, 1290437715);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test469");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test470");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass5 = hashCodeBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test471");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "" };
        int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 1, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) int5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 630 + "'", int5 == 630);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1259 + "'", int7 == 1259);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test472");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(932289);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(1073578991);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test473");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(48544, 23902);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test474");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1290437715, 1316879765);
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1524595259) + "'", int4 == (-1524595259));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test475");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 10);
        java.lang.Integer int7 = hashCodeBuilder4.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(23274);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1092616821 + "'", int7.equals(1092616821));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test476");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0.0f, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test477");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((java.lang.Object) 10);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(booleanArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test478");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, 1074789871);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test479");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test480");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        int int7 = hashCodeBuilder6.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35430646 + "'", int7 == 35430646);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test481");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1092616821, 1290437715, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test482");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        java.lang.Integer int7 = hashCodeBuilder2.build();
        java.lang.Class<?> wildcardClass8 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932289 + "'", int7.equals(932289));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test483");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test484");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 1065353845);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1311, (-489694039), (java.lang.Object) hashCodeBuilder4);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-489694039), false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1691353211 + "'", int7 == 1691353211);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-489693410) + "'", int9 == (-489693410));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test485");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((double) 23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test486");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(1065353845, 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 10, 48544, (java.lang.Object) hashCodeBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test487");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper(1065377081);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(17, (-629), (java.lang.Object) hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1072081558 + "'", int7 == 1072081558);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test488");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((float) 102604171);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-619) + "'", int5 == (-619));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test489");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) -1, 47915);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test490");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((double) 1);
        java.lang.Object[] objArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test491");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) 1938219936);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1651463579) + "'", int7.equals((-1651463579)));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test492");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((-629), (int) 'a');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) 0);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(obj7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-629) + "'", int3 == (-629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test493");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        int int7 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test494");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1290462886, (-489694041), (java.lang.Object) 1999958168, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test495");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1290462886, 25197, (java.lang.Object) 1999958168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test496");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31860784, (-1232125945));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test497");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(664, 1120404085);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test498");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        double[] doubleArray8 = new double[] { (-529), 861830, ' ' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test499");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        java.lang.Class<?> wildcardClass7 = hashCodeBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test500");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(23373);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }
}

