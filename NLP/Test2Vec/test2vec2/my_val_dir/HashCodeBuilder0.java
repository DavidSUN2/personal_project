
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test01");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 10, (int) '4', (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test02");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(10, (int) (byte) 10, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test03");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 0, (int) (short) 100, (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test04");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        boolean[] booleanArray7 = new boolean[] { true, true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test05");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        long[] longArray5 = new long[] { (byte) -1, ' ' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(longArray5);
        java.lang.Integer int7 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 993926 + "'", int7.equals(993926));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test06");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        boolean[] booleanArray6 = new boolean[] { true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(booleanArray6);
        java.lang.Object obj8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test07");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        long[] longArray5 = new long[] { (byte) -1, ' ' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(longArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test08");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test09");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (byte) 0, strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 629 + "'", int2 == 629);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test10");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (byte) 100, (int) ' ', (java.lang.Object) 993926);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test11");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 0, (int) (byte) -1, (java.lang.Object) 1290451337);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test12");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        boolean[] booleanArray6 = new boolean[] { true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test13");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(byteArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test15");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test16");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        java.lang.Class<?> wildcardClass1 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test17");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        java.lang.Class<?> wildcardClass3 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test18");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        boolean[] booleanArray6 = new boolean[] { true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test19");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        long[] longArray5 = new long[] { (byte) -1, ' ' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(longArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test20");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 10, (int) ' ', (java.lang.Object) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test21");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        boolean[] booleanArray6 = new boolean[] { true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder4.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test22");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((java.lang.Object) (short) 10);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (short) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 639 + "'", int8 == 639);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test23");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100.0f, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1120404085 + "'", int2 == 1120404085);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test24");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        java.lang.Integer int5 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1079598171 + "'", int5.equals(1079598171));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test25");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((float) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(0);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test26");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((float) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((double) 1.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 10.0f);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test27");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper((int) (short) 100);
        int int9 = hashCodeBuilder8.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 859832 + "'", int9 == 859832);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test28");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 100, 1120404085);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test29");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        int[] intArray7 = new int[] { '4', (short) 0, 100, (short) 1 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(intArray7);
        java.lang.Integer int9 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1200226536 + "'", int9.equals(1200226536));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test30");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(charArray3);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test31");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(byteArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.appendSuper((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test32");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        int[] intArray7 = new int[] { 100, (byte) 1 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test33");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1L, strArray7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append((java.lang.Object[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 630 + "'", int8 == 630);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test34");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(100, (int) (short) 100, (java.lang.Object) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test35");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((int) ' ');
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        java.lang.Integer int9 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1290451337 + "'", int8 == 1290451337);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1290426695 + "'", int9.equals(1290426695));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test36");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper(1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test37");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray3 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) -1);
        int int7 = hashCodeBuilder2.toHashCode();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 0, (int) 'a', (java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 628 + "'", int7 == 628);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test38");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(charArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test39");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(booleanArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test40");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        int int3 = hashCodeBuilder2.toHashCode();
        java.lang.Class<?> wildcardClass4 = hashCodeBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 726 + "'", int3 == 726);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test41");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) (short) 1, (int) (short) 10, (java.lang.Object) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test42");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((int) ' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(true);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 501147459 + "'", int9 == 501147459);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test43");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1.0d, (java.util.Collection<java.lang.String>) strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1072693877 + "'", int6 == 1072693877);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test44");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1L, strArray6);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(639, 1120404085, (java.lang.Object) 1L, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 630 + "'", int7 == 630);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1321328116) + "'", int9 == (-1321328116));
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test45");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper(1);
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test46");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray3 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper(1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) ' ', 0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test47");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((float) 1);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1065404720 + "'", int6 == 1065404720);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test48");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test49");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        int int5 = hashCodeBuilder0.toHashCode();
        double[] doubleArray8 = new double[] { 726, (-1321328116) };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 628 + "'", int5 == 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test50");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        boolean[] booleanArray3 = new boolean[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test51");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray3 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(628, (int) (byte) 10, (java.lang.Object) hashCodeBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test52");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(true);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test53");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) (byte) 10);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test54");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        java.lang.Integer int3 = hashCodeBuilder2.build();
        int int4 = hashCodeBuilder2.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 726 + "'", int3.equals(726));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 726 + "'", int4 == 726);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test55");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test56");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test57");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test58");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(0, (int) (byte) 0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test59");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((float) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((double) 628);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(obj7);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test60");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((long) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 100);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test61");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(charArray3);
        float[] floatArray7 = new float[] { (short) 100, 1200226536 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test62");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((long) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 100);
        int int7 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 997583 + "'", int7 == 997583);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test63");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper(1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test64");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(993926, (int) '#', obj2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test65");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        boolean[] booleanArray6 = new boolean[] { true };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(booleanArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test66");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(charArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper((int) ' ');
        int int7 = hashCodeBuilder6.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 661 + "'", int7 == 661);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test67");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        int int1 = hashCodeBuilder0.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder0.append((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder3);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test68");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) -1);
        int int5 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23642 + "'", int5 == 23642);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test69");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test70");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        short[] shortArray1 = new short[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append(shortArray1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((byte) -1);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(booleanArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test71");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append(628);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test72");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((float) 1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((double) 628);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((byte) 10);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test73");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test74");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
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
            System.out.format("%n%s%n", "HashCodeBuilder0.test75");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((long) 'a');
        int int5 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26959 + "'", int5 == 26959);
    }

    @Test
    public void HashCodeBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder0.test76");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append('a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((long) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }
}

