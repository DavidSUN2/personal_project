
package MultiBackgroundInitializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MultiBackgroundInitializer1 {

    public static boolean debug = false;

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test501");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService7 = multiBackgroundInitializer0.getExternalExecutor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService7);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test502");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test503");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults2 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = multiBackgroundInitializerResults2.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults2);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test504");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService5);
        boolean boolean7 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer1.getExternalExecutor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService9);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test505");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults6.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = multiBackgroundInitializerResults6.isException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test506");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService2);
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test507");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults4.initializerNames();
        boolean boolean6 = multiBackgroundInitializerResults4.isSuccessful();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults4.initializerNames();
        java.util.Set<java.lang.String> strSet8 = multiBackgroundInitializerResults4.initializerNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test508");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        boolean boolean9 = multiBackgroundInitializer1.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test509");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        boolean boolean6 = multiBackgroundInitializerResults5.isSuccessful();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test510");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass8 = multiBackgroundInitializerResultsFuture7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test511");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = multiBackgroundInitializerResults6.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test512");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.lang.Class<?> wildcardClass3 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test513");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults9 = multiBackgroundInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults9);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test514");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer0.get();
        boolean boolean8 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService9 = multiBackgroundInitializer0.getExternalExecutor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService9);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test515");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture3 = multiBackgroundInitializer1.getFuture();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException8 = multiBackgroundInitializerResults6.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test516");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.start();
        boolean boolean4 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer0.getFuture();
        boolean boolean7 = multiBackgroundInitializer0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test517");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        boolean boolean6 = multiBackgroundInitializerResults5.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiBackgroundInitializerResults5.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test518");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        boolean boolean7 = multiBackgroundInitializerResults6.isSuccessful();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test519");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer0.get();
        boolean boolean7 = multiBackgroundInitializer0.start();
        boolean boolean8 = multiBackgroundInitializer0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test520");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.setExternalExecutor(executorService4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test521");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean5 = multiBackgroundInitializer1.start();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults6.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException9 = multiBackgroundInitializerResults6.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test522");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test523");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer1.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test524");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        boolean boolean8 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture9 = multiBackgroundInitializer1.getFuture();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture9);
    }

    @Test
    public void MultiBackgroundInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer1.test525");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer4 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService5 = null;
        multiBackgroundInitializer4.setExternalExecutor(executorService5);
        multiBackgroundInitializer1.addInitializer("", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer4);
        java.util.concurrent.ExecutorService executorService8 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
    }
}

