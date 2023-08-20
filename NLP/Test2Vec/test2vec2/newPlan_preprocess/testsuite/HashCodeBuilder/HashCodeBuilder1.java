package HashCodeBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HashCodeBuilder1 {

    public static boolean debug = false;

    @Test
    public void HashCodeBuilder501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder501");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) 885743);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder502");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = new org.apache.commons.lang3.builder.HashCodeBuilder(909113, 1290437715);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((int) 'a', (-529), (java.lang.Object) 1290437715, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1290386402 + "'", int6 == 1290386402);
    }

    @Test
    public void HashCodeBuilder503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder503");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        int[] intArray4 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(intArray4);
        int int6 = hashCodeBuilder5.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 681 + "'", int6 == 681);
    }

    @Test
    public void HashCodeBuilder504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder504");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int5 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(861102, 1073578954, (java.lang.Object) hashCodeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder505");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        int int5 = hashCodeBuilder4.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(false);
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
    public void HashCodeBuilder506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder506");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((long) 1999958168);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder507");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        long[] longArray4 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(longArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(0);
        int[] intArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder508");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(' ');
        int int9 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-597) + "'", int9 == (-597));
    }

    @Test
    public void HashCodeBuilder509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder509");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 34495286);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper(0);
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
    public void HashCodeBuilder510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder510");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) '#', strArray6);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1), strArray6);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 34494657, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 664 + "'", int7 == 664);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 628 + "'", int8 == 628);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34495286 + "'", int9 == 34495286);
    }

    @Test
    public void HashCodeBuilder511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder511");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((double) 100L);
        int int9 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1111435191 + "'", int9 == 1111435191);
    }

    @Test
    public void HashCodeBuilder512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder512");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((int) (short) 0);
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
    public void HashCodeBuilder513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder513");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        int[] intArray4 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(intArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25323 + "'", int7 == 25323);
    }

    @Test
    public void HashCodeBuilder514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder514");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder1 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder1.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder3.append((java.lang.Object) (-1));
        double[] doubleArray7 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder3.append(doubleArray7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder515");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1152264119, (-1175392055));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper((-816651565));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder516");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        int[] intArray4 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(intArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.appendSuper(861064);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append('4');
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
    public void HashCodeBuilder517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder517");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1151607479 + "'", int4 == 1151607479);
    }

    @Test
    public void HashCodeBuilder518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder518");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder519");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(25323, 1860590971);
    }

    @Test
    public void HashCodeBuilder520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder520");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder0, false);
        int int3 = hashCodeBuilder0.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder0.append((double) 1120404085);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24659 + "'", int2 == 24659);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder521");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        boolean[] booleanArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(booleanArray3);
        int int5 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-341107991) + "'", int5 == (-341107991));
    }

    @Test
    public void HashCodeBuilder522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder522");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) (-1175392055));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder523");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 1987);
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
    public void HashCodeBuilder524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder524");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1860 + "'", int6 == 1860);
    }

    @Test
    public void HashCodeBuilder525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder525");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, (-1621504578));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder526");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(885741);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(862359, (-1), (java.lang.Object) 885741);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23382 + "'", int9 == 23382);
    }

    @Test
    public void HashCodeBuilder527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder527");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((-892709077), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder528");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1065377081, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder529");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        int int7 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35430646 + "'", int7 == 35430646);
    }

    @Test
    public void HashCodeBuilder530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder530");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        boolean[] booleanArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(booleanArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 23283);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder531");
        int int2 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 31861291, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31861920 + "'", int2 == 31861920);
    }

    @Test
    public void HashCodeBuilder532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder532");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(obj3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder533");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(1987);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append((byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((long) 628);
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
    public void HashCodeBuilder534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder534");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-341107991), (-888614648), (java.lang.Object) 1259);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder535");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.appendSuper((int) '4');
        int int5 = hashCodeBuilder4.toHashCode();
        java.lang.Integer int6 = hashCodeBuilder4.build();
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1999958168, 0, (java.lang.Object) int6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 681 + "'", int5 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 681 + "'", int6.equals(681));
    }

    @Test
    public void HashCodeBuilder536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder536");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) '4', 861730);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder537");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((double) 1151607479);
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
    public void HashCodeBuilder538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder538");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        double[] doubleArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder539");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(885741);
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
    public void HashCodeBuilder540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder540");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((-359018));
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
    public void HashCodeBuilder541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder541");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1342796563, 1310, (java.lang.Object) 1290437715);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder542");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder543");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((-1175392055));
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1175369448) + "'", int6 == (-1175369448));
    }

    @Test
    public void HashCodeBuilder544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder544");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((long) 34495286);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder545");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        int int5 = hashCodeBuilder4.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-629) + "'", int5 == (-629));
    }

    @Test
    public void HashCodeBuilder546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder546");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1290437715, (java.util.Collection<java.lang.String>) strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 629 + "'", int6 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1290438344 + "'", int7 == 1290438344);
    }

    @Test
    public void HashCodeBuilder547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder547");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(doubleArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append('4');
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
    public void HashCodeBuilder548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder548");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        short[] shortArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(shortArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) (byte) 1);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 885744 + "'", int8 == 885744);
    }

    @Test
    public void HashCodeBuilder549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder549");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1311, 885741);
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (-1621504578));
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) (-1621504578), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1311 + "'", int3 == 1311);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1621503949) + "'", int7 == (-1621503949));
    }

    @Test
    public void HashCodeBuilder550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder550");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(34517966);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder5.append(10.0d);
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
    public void HashCodeBuilder551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder551");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) 25900);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder552");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(31862106, 24659, (java.lang.Object) 861471);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder553");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        int int7 = hashCodeBuilder6.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((byte) -1);
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
    public void HashCodeBuilder554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder554");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        int[] intArray4 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(intArray4);
        java.lang.Integer int6 = hashCodeBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 681 + "'", int6.equals(681));
    }

    @Test
    public void HashCodeBuilder555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder555");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(628, 451808338);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder556");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(515660539, (int) (byte) 100, (java.lang.Object) 664);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder557");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.appendSuper((-1074789871));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
    }

    @Test
    public void HashCodeBuilder558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder558");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(23305);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(23902);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35382249 + "'", int9 == 35382249);
    }

    @Test
    public void HashCodeBuilder559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder559");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (short) 1, 2000819639);
    }

    @Test
    public void HashCodeBuilder560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder560");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(25900, (-1074789871));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder561");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(34496088, 515660539, (java.lang.Object) (-1621503949), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder562");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('#');
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append(1072693877);
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
    public void HashCodeBuilder563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder563");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Integer int3 = hashCodeBuilder0.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder0.append((long) 31862735);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
    }

    @Test
    public void HashCodeBuilder564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder564");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder565");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        java.lang.Integer int3 = hashCodeBuilder2.build();
        java.lang.Integer int4 = hashCodeBuilder2.build();
        java.lang.Integer int5 = hashCodeBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 629 + "'", int3.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 629 + "'", int4.equals(629));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5.equals(629));
    }

    @Test
    public void HashCodeBuilder566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder566");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(34517966, 24659, (java.lang.Object) 687260627, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder567");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        boolean[] booleanArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(booleanArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 862359);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append('4');
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
    public void HashCodeBuilder568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder568");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        double[] doubleArray7 = new double[] { (-1074789871), 1258, 34518001, 1866 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append(doubleArray7);
        java.lang.Class<?> wildcardClass9 = hashCodeBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void HashCodeBuilder569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder569");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(451808338, 1072693877);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder570");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        float[] floatArray8 = new float[] { 2081591608, 'a' };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder571");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 0);
        short[] shortArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(shortArray5);
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1987, 17, (java.lang.Object) shortArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The object to build a hash code for must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder572");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(31860784, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder573");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 100L, (java.util.Collection<java.lang.String>) strList4);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) strList4, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 729 + "'", int6 == 729);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 631 + "'", int8 == 631);
    }

    @Test
    public void HashCodeBuilder574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder574");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 681 + "'", int3 == 681);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
    }

    @Test
    public void HashCodeBuilder575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder575");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder((int) (byte) -1, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder3.append((float) 1310);
        byte[] byteArray7 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder5.append(byteArray7);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder576");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(23305);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.appendSuper((int) '4');
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
    public void HashCodeBuilder577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder577");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((long) 1999958168);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append('4');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 217744653 + "'", int9.equals(217744653));
    }

    @Test
    public void HashCodeBuilder578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder578");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(885741);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('4');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 67267162 + "'", int9.equals(67267162));
    }

    @Test
    public void HashCodeBuilder579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder579");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 628);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder580");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        long[] longArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(longArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append('4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.appendSuper((-489693410));
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
    public void HashCodeBuilder581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder581");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        long[] longArray4 = new long[] { 1232126045 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(longArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append((byte) 1);
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
    public void HashCodeBuilder582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder582");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) (short) -1);
        double[] doubleArray7 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder583");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(681);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) (byte) 100);
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
    public void HashCodeBuilder584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder584");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        char[] charArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(charArray3);
        double[] doubleArray6 = new double[] { 861730 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append(doubleArray6);
        java.lang.Integer int8 = hashCodeBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1094152177 + "'", int8.equals(1094152177));
    }

    @Test
    public void HashCodeBuilder585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder585");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(' ');
        java.lang.Integer int7 = hashCodeBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 936021 + "'", int7.equals(936021));
    }

    @Test
    public void HashCodeBuilder586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder586");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        java.lang.Integer int5 = hashCodeBuilder0.build();
        char[] charArray6 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append(charArray6);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append((java.lang.Object) 885744);
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
    public void HashCodeBuilder587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder587");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((double) 862359);
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
    public void HashCodeBuilder588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder588");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1358, (-1621503949));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder589");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((short) (byte) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 100);
        java.lang.Integer int9 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-539) + "'", int9.equals((-539)));
    }

    @Test
    public void HashCodeBuilder590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder590");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(100.0d);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((long) 1073625537);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder591");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1065353845);
        java.lang.Integer int5 = hashCodeBuilder4.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append((long) 23902);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1316879765 + "'", int5.equals(1316879765));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1316832627) + "'", int9 == (-1316832627));
    }

    @Test
    public void HashCodeBuilder592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder592");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((byte) 10);
        int int5 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append((int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(' ');
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
    public void HashCodeBuilder593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder593");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        int int7 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0L, (java.util.Collection<java.lang.String>) strList5);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 0.0d, (java.util.Collection<java.lang.String>) strList5);
        int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) 1232125416, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 629 + "'", int7 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 629 + "'", int8 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1232126045 + "'", int9 == 1232126045);
    }

    @Test
    public void HashCodeBuilder594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder594");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(byteArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder595");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append(shortArray5);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 932262 + "'", int7.equals(932262));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder596");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        java.lang.Integer int5 = hashCodeBuilder4.build();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder4.append((long) 861471);
        java.lang.Object[] objArray8 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-629) + "'", int5.equals((-629)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder597");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        int[] intArray4 = new int[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(intArray4);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append('#');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder2.append(false);
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
    public void HashCodeBuilder598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder598");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((-1175392055));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((long) 1151607479);
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
    public void HashCodeBuilder599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder599");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append(byteArray4);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder2.append(objArray6);
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
    public void HashCodeBuilder600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder600");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 629);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((short) (byte) 1);
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
    public void HashCodeBuilder601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder601");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.appendSuper(1999958168);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder602");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(false);
        int int7 = hashCodeBuilder6.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder6.append((double) (-341107991));
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
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder603");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper(34494657);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((byte) 0);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1310933902 + "'", int9.equals(1310933902));
    }

    @Test
    public void HashCodeBuilder604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder604");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(932918, (-1074789871), (java.lang.Object) 47915, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder605");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((java.lang.Object) (-1));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper((-1175392055));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.appendSuper(23274);
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
    public void HashCodeBuilder606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder606");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((-1074789771));
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append((-539));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder607");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((short) 0);
        long[] longArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(longArray5);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append('a');
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int9 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(1, 0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
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
    public void HashCodeBuilder608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder608");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((float) 1310);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(true);
        int int6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder4, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-341083349) + "'", int6 == (-341083349));
    }

    @Test
    public void HashCodeBuilder609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder609");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) (byte) 0);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(objArray3);
        int int5 = hashCodeBuilder0.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder0.append((long) 47925);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder0.append((float) 1065353845);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 629 + "'", int5 == 629);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder9);
    }

    @Test
    public void HashCodeBuilder610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder610");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(34494657, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder611");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append((short) (byte) 100);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.append(' ');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder0.append((float) 23305);
        int int9 = hashCodeBuilder0.toHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1220970057 + "'", int9 == 1220970057);
    }

    @Test
    public void HashCodeBuilder612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder612");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int4 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(861730, 861099, (java.lang.Object) 1072081558, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires an odd initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder613");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((double) 932289);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder614");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder2.append((float) (-816651565));
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
    public void HashCodeBuilder615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder615");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((double) 0.0f);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append((float) 10);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((long) 719);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder616");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            int int3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((-1175392055), 0, (java.lang.Object) 885100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero multiplier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder617");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 34495286);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.appendSuper(885743);
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
    public void HashCodeBuilder618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder618");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(34517966);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder9 = hashCodeBuilder7.append('4');
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
    public void HashCodeBuilder619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder619");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(885741, 31861291);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((long) 1938219936);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder6.append(25323);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder620");
        // The following exception was thrown during execution in HashCodeBuilder generation
        try {
            org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(0, 1073625537);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: HashCodeBuilder requires a non zero initial value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void HashCodeBuilder621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder621");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(629, (int) (byte) -1);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((float) 1065353845);
        double[] doubleArray7 = new double[] { (-489694039), 1866 };
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder8);
    }

    @Test
    public void HashCodeBuilder622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder622");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder8 = hashCodeBuilder4.append((float) 885741);
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
    public void HashCodeBuilder623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder623");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(1232126045, 631);
    }

    @Test
    public void HashCodeBuilder624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder624");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = new org.apache.commons.lang3.builder.HashCodeBuilder(932289, (int) 'a');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append((int) (short) 100);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder4.append(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }

    @Test
    public void HashCodeBuilder625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder625");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.append((double) 34495286);
        java.lang.Integer int7 = hashCodeBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-242379130) + "'", int7.equals((-242379130)));
    }

    @Test
    public void HashCodeBuilder626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder626");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        int int3 = hashCodeBuilder2.toHashCode();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder2.append((float) (short) 0);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder7 = hashCodeBuilder5.append(false);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 932290 + "'", int8.equals(932290));
    }

    @Test
    public void HashCodeBuilder627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder627");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.appendSuper((int) '4');
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder2.append(true);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder2.appendSuper(629);
        int int8 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((java.lang.Object) hashCodeBuilder6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 957560 + "'", int8 == 957560);
    }

    @Test
    public void HashCodeBuilder628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HashCodeBuilder1.HashCodeBuilder628");
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder0.append((short) 0);
        char[] charArray3 = null;
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder0.append(charArray3);
        org.apache.commons.lang3.builder.HashCodeBuilder hashCodeBuilder6 = hashCodeBuilder0.appendSuper((-597));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashCodeBuilder6);
    }
}

