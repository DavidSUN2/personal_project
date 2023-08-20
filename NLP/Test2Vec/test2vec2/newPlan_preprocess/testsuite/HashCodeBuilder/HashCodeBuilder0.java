package HashCodeBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HashCodeBuilder0 {

    public static boolean debug = false;

    @Test
    public void HashCodeBuilder001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder001");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0.0f, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder002");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder003");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) '#', (int) (byte) 10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder004");
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
    public void HashCodeBuilder005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder005");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 10, (int) '4', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder006");
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
    public void HashCodeBuilder007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder007");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder008");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder009");
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
    public void HashCodeBuilder010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder010");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100.0f, strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120404085 + "'", int2 == 1120404085);
    }

    @Test
    public void HashCodeBuilder011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder011");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 1, 1120404085, (java.lang.Object) "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1120404085 + "'", int4 == 1120404085);
    }

    @Test
    public void HashCodeBuilder012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder012");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, 10, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder013");
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
    public void HashCodeBuilder014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder014");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) 'a', (int) (byte) 100, (java.lang.Object) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder015");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 664);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder016");
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
    public void HashCodeBuilder017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder017");
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
    public void HashCodeBuilder018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder018");
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
    public void HashCodeBuilder019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder019");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(664, 0, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder020");
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
    public void HashCodeBuilder021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder021");
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
    public void HashCodeBuilder022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder022");
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
    public void HashCodeBuilder023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder023");
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
    public void HashCodeBuilder024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder024");
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
    public void HashCodeBuilder025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder025");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder026");
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
    public void HashCodeBuilder027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder027");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 100, (int) (short) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder028");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(664, 0, (java.lang.Object) 681);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder029");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder030");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1), (int) (byte) 0, (java.lang.Object) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder031");
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
    public void HashCodeBuilder032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder032");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "" };
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', strArray5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder033");
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
    public void HashCodeBuilder034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder034");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 630 + "'", int2 == 630);
    }

    @Test
    public void HashCodeBuilder035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder035");
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
    public void HashCodeBuilder036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder036");
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
    public void HashCodeBuilder037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder037");
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
    public void HashCodeBuilder038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder038");
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
    public void HashCodeBuilder039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder039");
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
    public void HashCodeBuilder040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder040");
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
    public void HashCodeBuilder041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder041");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) 'a', 23902);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder042");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder043");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(664, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder044");
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
    public void HashCodeBuilder045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder045");
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
    public void HashCodeBuilder046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder046");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23902, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder047");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder048");
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
    public void HashCodeBuilder049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder049");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder050");
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
    public void HashCodeBuilder051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder051");
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
    public void HashCodeBuilder052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder052");
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
    public void HashCodeBuilder053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder053");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(681, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder054");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder055");
        int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) 'a', (-1074789771), (java.lang.Object) 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1175392055) + "'", int3 == (-1175392055));
    }

    @Test
    public void HashCodeBuilder056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder056");
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
    public void HashCodeBuilder057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder057");
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
    public void HashCodeBuilder058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder058");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(objArray5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder059");
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
    public void HashCodeBuilder060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder060");
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
    public void HashCodeBuilder061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder061");
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
    public void HashCodeBuilder062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder062");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder063");
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
    public void HashCodeBuilder064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder064");
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
    public void HashCodeBuilder065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder065");
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
    public void HashCodeBuilder066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder066");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) 10, (-1175392055));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder067");
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
    public void HashCodeBuilder068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder068");
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
    public void HashCodeBuilder069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder069");
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
    public void HashCodeBuilder070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder070");
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
    public void HashCodeBuilder071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder071");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder072");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, (int) '#', (java.lang.Object) 1065353845);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder073");
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
    public void HashCodeBuilder074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder074");
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
    public void HashCodeBuilder075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder075");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder076");
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
    public void HashCodeBuilder077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder077");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder078");
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
    public void HashCodeBuilder079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder079");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1120404085, 1065353845, (java.lang.Object) 729, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 451808338 + "'", int4 == 451808338);
    }

    @Test
    public void HashCodeBuilder080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder080");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 729 + "'", int2 == 729);
    }

    @Test
    public void HashCodeBuilder081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder081");
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
    public void HashCodeBuilder082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder082");
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
    public void HashCodeBuilder083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder083");
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
    public void HashCodeBuilder084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder084");
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
    public void HashCodeBuilder085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder085");
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
    public void HashCodeBuilder086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder086");
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
    public void HashCodeBuilder087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder087");
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
    public void HashCodeBuilder088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder088");
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
    public void HashCodeBuilder089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder089");
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
    public void HashCodeBuilder090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder090");
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
    public void HashCodeBuilder091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder091");
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
    public void HashCodeBuilder092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder092");
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
    public void HashCodeBuilder093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder093");
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
    public void HashCodeBuilder094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder094");
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
    public void HashCodeBuilder095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder095");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 1999958168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder096");
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
    public void HashCodeBuilder097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder097");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(629);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder098");
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
    public void HashCodeBuilder099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder099");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper(629);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder100");
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
    public void HashCodeBuilder101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder101");
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
    public void HashCodeBuilder102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder102");
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
    public void HashCodeBuilder103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder103");
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
    public void HashCodeBuilder104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder104");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder105");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1258, 885741);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder106");
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
    public void HashCodeBuilder107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder107");
        int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(681, (int) (byte) 1, (java.lang.Object) 630);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
    }

    @Test
    public void HashCodeBuilder108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder108");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(1.0f);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder109");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23273, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder110");
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
    public void HashCodeBuilder111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder111");
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
    public void HashCodeBuilder112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder112");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23902, 628);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder113");
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
    public void HashCodeBuilder114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder114");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 10, (-1074789771));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder115");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((-1175392055), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder116");
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
    public void HashCodeBuilder117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder117");
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
    public void HashCodeBuilder118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder118");
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
    public void HashCodeBuilder119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder119");
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
    public void HashCodeBuilder120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder120");
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
    public void HashCodeBuilder121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder121");
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
    public void HashCodeBuilder122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder122");
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
    public void HashCodeBuilder123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder123");
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
    public void HashCodeBuilder124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder124");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(objArray5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) objArray5, false);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder125");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1860 + "'", int2 == 1860);
    }

    @Test
    public void HashCodeBuilder126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder126");
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
    public void HashCodeBuilder127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder127");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(17, 47925, (java.lang.Object) (short) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 814735 + "'", int4 == 814735);
    }

    @Test
    public void HashCodeBuilder128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder128");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(obj5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder129");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder130");
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
    public void HashCodeBuilder131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder131");
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
    public void HashCodeBuilder132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder132");
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
    public void HashCodeBuilder133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder133");
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
    public void HashCodeBuilder134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder134");
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
    public void HashCodeBuilder135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder135");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1232125416, 861101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder136");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 0, 1065353845, (java.lang.Object) 23273, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder137");
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
    public void HashCodeBuilder138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder138");
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
    public void HashCodeBuilder139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder139");
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
    public void HashCodeBuilder140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder140");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885743, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder141");
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
    public void HashCodeBuilder142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder142");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 25271, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25900 + "'", int2 == 25900);
    }

    @Test
    public void HashCodeBuilder143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder143");
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
    public void HashCodeBuilder144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder144");
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
    public void HashCodeBuilder145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder145");
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
    public void HashCodeBuilder146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder146");
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
    public void HashCodeBuilder147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder147");
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
    public void HashCodeBuilder148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder148");
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
    public void HashCodeBuilder149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder149");
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
    public void HashCodeBuilder150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder150");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        int int5 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-529) + "'", int5 == (-529));
    }

    @Test
    public void HashCodeBuilder151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder151");
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
    public void HashCodeBuilder152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder152");
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
    public void HashCodeBuilder153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder153");
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
    public void HashCodeBuilder154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder154");
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
    public void HashCodeBuilder155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder155");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(861730, 1092616821);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder156");
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
    public void HashCodeBuilder157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder157");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (short) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder158");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(23274, (-619), obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder159");
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
    public void HashCodeBuilder160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder160");
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
    public void HashCodeBuilder161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder161");
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
    public void HashCodeBuilder162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder162");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100.0d);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder163");
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
    public void HashCodeBuilder164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder164");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 1866);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder165");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder166");
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
    public void HashCodeBuilder167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder167");
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
    public void HashCodeBuilder168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder168");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1866 + "'", int2 == 1866);
    }

    @Test
    public void HashCodeBuilder169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder169");
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
    public void HashCodeBuilder170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder170");
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
    public void HashCodeBuilder171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder171");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100.0f, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120404085 + "'", int2 == 1120404085);
    }

    @Test
    public void HashCodeBuilder172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder172");
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
    public void HashCodeBuilder173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder173");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(1065353845);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder174");
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
    public void HashCodeBuilder175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder175");
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
    public void HashCodeBuilder176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder176");
        java.lang.Object obj0 = new java.lang.Object();
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(obj0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void HashCodeBuilder177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder177");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((int) (short) 100);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder178");
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
    public void HashCodeBuilder179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder179");
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
    public void HashCodeBuilder180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder180");
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
    public void HashCodeBuilder181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder181");
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
    public void HashCodeBuilder182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder182");
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
    public void HashCodeBuilder183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder183");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder184");
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
    public void HashCodeBuilder185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder185");
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
    public void HashCodeBuilder186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder186");
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
    public void HashCodeBuilder187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder187");
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
    public void HashCodeBuilder188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder188");
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
    public void HashCodeBuilder189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder189");
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
    public void HashCodeBuilder190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder190");
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
    public void HashCodeBuilder191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder191");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder192");
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
    public void HashCodeBuilder193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder193");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, (int) 'a', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder194");
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
    public void HashCodeBuilder195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder195");
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
    public void HashCodeBuilder196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder196");
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
    public void HashCodeBuilder197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder197");
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
    public void HashCodeBuilder198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder198");
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
    public void HashCodeBuilder199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder199");
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
    public void HashCodeBuilder200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder200");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        int int7 = hashCodeBuilder4.toHashCode();
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder201");
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
    public void HashCodeBuilder202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder202");
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
    public void HashCodeBuilder203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder203");
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
    public void HashCodeBuilder204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder204");
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
    public void HashCodeBuilder205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder205");
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
    public void HashCodeBuilder206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder206");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932288, 34495286, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder207");
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
    public void HashCodeBuilder208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder208");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-529), false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void HashCodeBuilder209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder209");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder210");
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
    public void HashCodeBuilder211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder211");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder212");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(861102, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder213");
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
    public void HashCodeBuilder214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder214");
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
    public void HashCodeBuilder215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder215");
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
    public void HashCodeBuilder216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder216");
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
    public void HashCodeBuilder217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder217");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-629), 1860590971, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder218");
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
    public void HashCodeBuilder219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder219");
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
    public void HashCodeBuilder220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder220");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1860590971, 628, (java.lang.Object) 681, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder221");
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
    public void HashCodeBuilder222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder222");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23373, 1073554312);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder223");
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
    public void HashCodeBuilder224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder224");
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
    public void HashCodeBuilder225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder225");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 10, 17, (java.lang.Object) 34495286, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder226");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, (int) (short) 1);
        boolean[] booleanArray6 = new boolean[] { false, true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder227");
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
    public void HashCodeBuilder228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder228");
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
    public void HashCodeBuilder229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder229");
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
    public void HashCodeBuilder230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder230");
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
    public void HashCodeBuilder231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder231");
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
    public void HashCodeBuilder232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder232");
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
    public void HashCodeBuilder233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder233");
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
    public void HashCodeBuilder234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder234");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31862735, (-489694039));
    }

    @Test
    public void HashCodeBuilder235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder235");
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
    public void HashCodeBuilder236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder236");
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
    public void HashCodeBuilder237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder237");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31886748, 1065377081);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder238");
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
    public void HashCodeBuilder239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder239");
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
    public void HashCodeBuilder240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder240");
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
    public void HashCodeBuilder241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder241");
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
    public void HashCodeBuilder242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder242");
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
    public void HashCodeBuilder243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder243");
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
    public void HashCodeBuilder244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder244");
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
    public void HashCodeBuilder245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder245");
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
    public void HashCodeBuilder246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder246");
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
    public void HashCodeBuilder247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder247");
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
    public void HashCodeBuilder248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder248");
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
    public void HashCodeBuilder249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder249");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 1065377081);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder250");
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
    public void HashCodeBuilder251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder251");
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
    public void HashCodeBuilder252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder252");
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
    public void HashCodeBuilder253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder253");
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
    public void HashCodeBuilder254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder254");
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
    public void HashCodeBuilder255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder255");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932918, 1691353211, obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder256");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31886748, 23273);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder257");
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
    public void HashCodeBuilder258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder258");
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
    public void HashCodeBuilder259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder259");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100L, (java.util.Collection<java.lang.String>) strList5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder260");
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
    public void HashCodeBuilder261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder261");
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
    public void HashCodeBuilder262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder262");
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
    public void HashCodeBuilder263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder263");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(34518001, 31862735);
    }

    @Test
    public void HashCodeBuilder264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder264");
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
    public void HashCodeBuilder265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder265");
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
    public void HashCodeBuilder266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder266");
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
    public void HashCodeBuilder267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder267");
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
    public void HashCodeBuilder268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder268");
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
    public void HashCodeBuilder269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder269");
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
    public void HashCodeBuilder270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder270");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 629);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder271");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((float) 10);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder272");
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
    public void HashCodeBuilder273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder273");
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
    public void HashCodeBuilder274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder274");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23274, 451808338);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder275");
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
    public void HashCodeBuilder276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder276");
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
    public void HashCodeBuilder277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder277");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1074789771));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder278");
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
    public void HashCodeBuilder279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder279");
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
    public void HashCodeBuilder280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder280");
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
    public void HashCodeBuilder281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder281");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(23373, 1065353845);
    }

    @Test
    public void HashCodeBuilder282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder282");
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
    public void HashCodeBuilder283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder283");
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
    public void HashCodeBuilder284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder284");
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
    public void HashCodeBuilder285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder285");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1.0d), (java.util.Collection<java.lang.String>) strList5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder286");
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
    public void HashCodeBuilder287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder287");
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
    public void HashCodeBuilder288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder288");
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
    public void HashCodeBuilder289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder289");
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
    public void HashCodeBuilder290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder290");
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
    public void HashCodeBuilder291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder291");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, 861064);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder292");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder293");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        char[] charArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(charArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1L);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder294");
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
    public void HashCodeBuilder295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder295");
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
    public void HashCodeBuilder296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder296");
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
    public void HashCodeBuilder297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder297");
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
    public void HashCodeBuilder298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder298");
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
    public void HashCodeBuilder299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder299");
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
    public void HashCodeBuilder300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder300");
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
    public void HashCodeBuilder301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder301");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, 932918);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder302");
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
    public void HashCodeBuilder303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder303");
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
    public void HashCodeBuilder304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder304");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder305");
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
    public void HashCodeBuilder306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder306");
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
    public void HashCodeBuilder307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder307");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1310);
        long[] longArray6 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(longArray6);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder308");
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
    public void HashCodeBuilder309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder309");
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
    public void HashCodeBuilder310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder310");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(729);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder311");
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
    public void HashCodeBuilder312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder312");
        int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(909113, 885743, (java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2081591608 + "'", int3 == 2081591608);
    }

    @Test
    public void HashCodeBuilder313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder313");
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
    public void HashCodeBuilder314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder314");
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
    public void HashCodeBuilder315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder315");
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
    public void HashCodeBuilder316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder316");
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
    public void HashCodeBuilder317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder317");
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
    public void HashCodeBuilder318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder318");
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
    public void HashCodeBuilder319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder319");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, (int) (short) 1);
        int int3 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void HashCodeBuilder320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder320");
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
    public void HashCodeBuilder321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder321");
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
    public void HashCodeBuilder322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder322");
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
    public void HashCodeBuilder323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder323");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((short) -1);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder324");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(628, 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder325");
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
    public void HashCodeBuilder326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder326");
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
    public void HashCodeBuilder327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder327");
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
    public void HashCodeBuilder328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder328");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(1065353845, 1065353845);
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(34495286, 1987, (java.lang.Object) 1065353845);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder329");
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
    public void HashCodeBuilder330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder330");
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
    public void HashCodeBuilder331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder331");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932262, 1187670566, (java.lang.Object) (-892709077));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder332");
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
    public void HashCodeBuilder333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder333");
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
    public void HashCodeBuilder334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder334");
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
    public void HashCodeBuilder335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder335");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(35430646, 1987);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder336");
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
    public void HashCodeBuilder337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder337");
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
    public void HashCodeBuilder338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder338");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1, 31862106);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder339");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1074789871, 909113, obj2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder340");
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
    public void HashCodeBuilder341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder341");
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
    public void HashCodeBuilder342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder342");
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
    public void HashCodeBuilder343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder343");
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
    public void HashCodeBuilder344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder344");
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
    public void HashCodeBuilder345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder345");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder346");
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
    public void HashCodeBuilder347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder347");
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
    public void HashCodeBuilder348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder348");
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
    public void HashCodeBuilder349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder349");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((-1074789771));
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder350");
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
    public void HashCodeBuilder351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder351");
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
    public void HashCodeBuilder352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder352");
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
    public void HashCodeBuilder353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder353");
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
    public void HashCodeBuilder354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder354");
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
    public void HashCodeBuilder355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder355");
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
    public void HashCodeBuilder356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder356");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', strArray6);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1), strArray6);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder357");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885743, (int) (short) 1);
        short[] shortArray8 = new short[] { (short) -1, (byte) 10, (byte) 1, (short) 10, (short) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder358");
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
    public void HashCodeBuilder359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder359");
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
    public void HashCodeBuilder360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder360");
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
    public void HashCodeBuilder361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder361");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(2081591608, 628);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder362");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (-529));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder363");
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
    public void HashCodeBuilder364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder364");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1074789871, (-619));
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder365");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 1, 932262, (java.lang.Object) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder366");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1), 33586528, (java.lang.Object) 1152264119);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder367");
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
    public void HashCodeBuilder368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder368");
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
    public void HashCodeBuilder369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder369");
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
    public void HashCodeBuilder370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder370");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder371");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder372");
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
    public void HashCodeBuilder373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder373");
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
    public void HashCodeBuilder374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder374");
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
    public void HashCodeBuilder375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder375");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        java.lang.Integer int1 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1.equals(17));
    }

    @Test
    public void HashCodeBuilder376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder376");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(34494657, 34494657, (java.lang.Object) (byte) -1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-673103488) + "'", int4 == (-673103488));
    }

    @Test
    public void HashCodeBuilder377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder377");
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(885743, 23283, (java.lang.Object) 35430646, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-816651565) + "'", int4 == (-816651565));
    }

    @Test
    public void HashCodeBuilder378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder378");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder379");
        java.util.Collection<java.lang.String> strCollection1 = null;
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 861730, strCollection1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 862359 + "'", int2 == 862359);
    }

    @Test
    public void HashCodeBuilder380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder380");
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
    public void HashCodeBuilder381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder381");
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
    public void HashCodeBuilder382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder382");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder383");
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
    public void HashCodeBuilder384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder384");
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
    public void HashCodeBuilder385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder385");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, 31862106);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder386");
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
    public void HashCodeBuilder387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder387");
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
    public void HashCodeBuilder388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder388");
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
    public void HashCodeBuilder389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder389");
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
    public void HashCodeBuilder390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder390");
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
    public void HashCodeBuilder391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder391");
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
    public void HashCodeBuilder392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder392");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(515660539, 1691353211);
    }

    @Test
    public void HashCodeBuilder393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder393");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(862359, 630);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder394");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder395");
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
    public void HashCodeBuilder396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder396");
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
    public void HashCodeBuilder397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder397");
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
    public void HashCodeBuilder398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder398");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        short[] shortArray7 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(shortArray7);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder399");
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
    public void HashCodeBuilder400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder400");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 34494657, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34495286 + "'", int2 == 34495286);
    }

    @Test
    public void HashCodeBuilder401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder401");
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
    public void HashCodeBuilder402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder402");
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
    public void HashCodeBuilder403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder403");
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
    public void HashCodeBuilder404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder404");
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
    public void HashCodeBuilder405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder405");
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
    public void HashCodeBuilder406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder406");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(630, 2081591608);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder407");
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
    public void HashCodeBuilder408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder408");
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
    public void HashCodeBuilder409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder409");
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
    public void HashCodeBuilder410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder410");
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
    public void HashCodeBuilder411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder411");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(48544, 729);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder412");
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
    public void HashCodeBuilder413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder413");
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
    public void HashCodeBuilder414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder414");
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
    public void HashCodeBuilder415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder415");
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
    public void HashCodeBuilder416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder416");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder((-629), (int) 'a');
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(814735, 1232125416, (java.lang.Object) (-629), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder417");
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
    public void HashCodeBuilder418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder418");
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
    public void HashCodeBuilder419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder419");
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
    public void HashCodeBuilder420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder420");
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
    public void HashCodeBuilder421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder421");
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
    public void HashCodeBuilder422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder422");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(34518001, 1187670566);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder423");
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
    public void HashCodeBuilder424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder424");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1065353845, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1065354474 + "'", int2 == 1065354474);
    }

    @Test
    public void HashCodeBuilder425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder425");
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
    public void HashCodeBuilder426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder426");
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
    public void HashCodeBuilder427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder427");
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
    public void HashCodeBuilder428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder428");
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
    public void HashCodeBuilder429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder429");
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
    public void HashCodeBuilder430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder430");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1.0d, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693877 + "'", int2 == 1072693877);
    }

    @Test
    public void HashCodeBuilder431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder431");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '#', 34494657);
    }

    @Test
    public void HashCodeBuilder432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder432");
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
    public void HashCodeBuilder433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder433");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 31862106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder434");
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
    public void HashCodeBuilder435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder435");
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
    public void HashCodeBuilder436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder436");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper(1065377081);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder437");
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
    public void HashCodeBuilder438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder438");
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
    public void HashCodeBuilder439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder439");
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
    public void HashCodeBuilder440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder440");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append('#');
        java.lang.Integer int5 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90432068 + "'", int5.equals(90432068));
    }

    @Test
    public void HashCodeBuilder441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder441");
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
    public void HashCodeBuilder442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder442");
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
    public void HashCodeBuilder443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder443");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper(1065377081);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder444");
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
    public void HashCodeBuilder445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder445");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) 0, (-619));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder446");
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
    public void HashCodeBuilder447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder447");
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
    public void HashCodeBuilder448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder448");
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
    public void HashCodeBuilder449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder449");
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
    public void HashCodeBuilder450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder450");
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
    public void HashCodeBuilder451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder451");
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
    public void HashCodeBuilder452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder452");
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
    public void HashCodeBuilder453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder453");
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
    public void HashCodeBuilder454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder454");
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
    public void HashCodeBuilder455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder455");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1299393155, 729);
    }

    @Test
    public void HashCodeBuilder456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder456");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (-1096616298));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder457");
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
    public void HashCodeBuilder458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder458");
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
    public void HashCodeBuilder459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder459");
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
    public void HashCodeBuilder460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder460");
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
    public void HashCodeBuilder461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder461");
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
    public void HashCodeBuilder462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder462");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1232125416, 501574771);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder463");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 1065353845);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder464");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(861471, (int) (short) 10, (java.lang.Object) 1187670566);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder465");
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
    public void HashCodeBuilder466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder466");
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
    public void HashCodeBuilder467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder467");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1074789871, 1258);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder468");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(909113, 1290437715);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder469");
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
    public void HashCodeBuilder470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder470");
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
    public void HashCodeBuilder471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder471");
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
    public void HashCodeBuilder472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder472");
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
    public void HashCodeBuilder473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder473");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(48544, 23902);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder474");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1290437715, 1316879765);
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1524595259) + "'", int4 == (-1524595259));
    }

    @Test
    public void HashCodeBuilder475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder475");
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
    public void HashCodeBuilder476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder476");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0.0f, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder477");
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
    public void HashCodeBuilder478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder478");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, 1074789871);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder479");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder480");
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
    public void HashCodeBuilder481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder481");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1092616821, 1290437715, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder482");
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
    public void HashCodeBuilder483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder483");
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
    public void HashCodeBuilder484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder484");
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
    public void HashCodeBuilder485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder485");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((double) 23273);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder486");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(1065353845, 1065353845);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper((int) (short) 10);
        // The following exception was thrown during execution in HashCodeBuilder generation
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
    public void HashCodeBuilder487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder487");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(17, (int) '#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper(1065377081);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(17, (-629), (java.lang.Object) hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1072081558 + "'", int7 == 1072081558);
    }

    @Test
    public void HashCodeBuilder488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder488");
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
    public void HashCodeBuilder489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder489");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) -1, 47915);
    }

    @Test
    public void HashCodeBuilder490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder490");
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
    public void HashCodeBuilder491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder491");
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
    public void HashCodeBuilder492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder492");
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
    public void HashCodeBuilder493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder493");
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
    public void HashCodeBuilder494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder494");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1290462886, (-489694041), (java.lang.Object) 1999958168, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder495");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1290462886, 25197, (java.lang.Object) 1999958168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder496");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31860784, (-1232125945));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder497");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(664, 1120404085);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder498");
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
    public void HashCodeBuilder499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder499");
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
    public void HashCodeBuilder500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.HashCodeBuilder500");
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

