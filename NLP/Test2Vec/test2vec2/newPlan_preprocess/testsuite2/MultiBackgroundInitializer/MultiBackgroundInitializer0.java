package MultiBackgroundInitializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MultiBackgroundInitializer0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test01");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults2 = multiBackgroundInitializer1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test02");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.lang.Class<?> wildcardClass2 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test03");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.lang.Class<?> wildcardClass4 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test04");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture1 = multiBackgroundInitializer0.getFuture();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test05");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults1 = multiBackgroundInitializer0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test06");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer8 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService7);
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("hi!", (org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults>) multiBackgroundInitializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: addInitializer() must not be called after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test07");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        java.lang.Class<?> wildcardClass4 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test08");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture3 = multiBackgroundInitializer1.getFuture();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test09");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test10");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = multiBackgroundInitializerResults3.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test11");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
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
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test12");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = multiBackgroundInitializerResults3.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test13");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = multiBackgroundInitializerResults3.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test14");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture3 = multiBackgroundInitializer1.getFuture();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test15");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults4 = multiBackgroundInitializer1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: start() must be called first!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test16");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsBackgroundInitializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializerResultsBackgroundInitializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Child initializer must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test17");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer6 = multiBackgroundInitializerResults3.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test18");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        boolean boolean3 = multiBackgroundInitializer0.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test19");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer7 = multiBackgroundInitializerResults3.getInitializer("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test20");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = multiBackgroundInitializerResults3.getResultObject("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test21");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException7 = multiBackgroundInitializerResults3.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test22");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test23");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException5 = multiBackgroundInitializerResults3.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test24");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException7 = multiBackgroundInitializerResults3.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test25");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        java.util.concurrent.ExecutorService executorService4 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.setExternalExecutor(executorService5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test26");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException6 = multiBackgroundInitializerResults3.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test27");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        java.util.Set<java.lang.String> strSet6 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer8 = multiBackgroundInitializerResults3.getInitializer("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test28");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.lang.Class<?> wildcardClass5 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test29");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        java.util.Set<java.lang.String> strSet6 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = multiBackgroundInitializerResults3.getResultObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test30");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        java.lang.Class<?> wildcardClass6 = multiBackgroundInitializerResults5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test31");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        java.util.Set<java.lang.String> strSet6 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = multiBackgroundInitializerResults3.isException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test32");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer7 = multiBackgroundInitializerResults3.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test33");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        boolean boolean5 = multiBackgroundInitializer0.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test34");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        java.util.Set<java.lang.String> strSet6 = multiBackgroundInitializerResults3.initializerNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException8 = multiBackgroundInitializerResults3.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test35");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test36");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = multiBackgroundInitializerResults5.isException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test37");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer7 = multiBackgroundInitializerResults5.getInitializer("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test38");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.ExecutorService executorService4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer0.setExternalExecutor(executorService4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test39");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass6 = multiBackgroundInitializerResultsFuture5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test40");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test41");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer0.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test42");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.util.Set<java.lang.String> strSet5 = multiBackgroundInitializerResults3.initializerNames();
        java.util.Set<java.lang.String> strSet6 = multiBackgroundInitializerResults3.initializerNames();
        boolean boolean7 = multiBackgroundInitializerResults3.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException9 = multiBackgroundInitializerResults3.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test43");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService5);
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test44");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass8 = multiBackgroundInitializerResultsFuture7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test45");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        java.lang.Class<?> wildcardClass5 = multiBackgroundInitializerResults3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test46");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        java.util.concurrent.ExecutorService executorService1 = null;
        multiBackgroundInitializer0.setExternalExecutor(executorService1);
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer0.getExternalExecutor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test47");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = multiBackgroundInitializerResults3.isException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test48");
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test49");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException7 = multiBackgroundInitializerResults5.getException("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name ");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test50");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.start();
        boolean boolean7 = multiBackgroundInitializer1.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test51");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet7 = multiBackgroundInitializerResults6.initializerNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test52");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test53");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException7 = multiBackgroundInitializerResults5.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test54");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer0.getFuture();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test55");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass7 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test56");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        java.lang.Class<?> wildcardClass7 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test57");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        boolean boolean6 = multiBackgroundInitializer1.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test58");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        boolean boolean7 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService8 = multiBackgroundInitializer1.getExternalExecutor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService8);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test59");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass8 = multiBackgroundInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test60");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean7 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture8 = multiBackgroundInitializer1.getFuture();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture8);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test61");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        boolean boolean5 = multiBackgroundInitializer1.start();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test62");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.ExecutorService executorService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.setExternalExecutor(executorService7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test63");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.start();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        java.lang.Class<?> wildcardClass8 = multiBackgroundInitializerResultsFuture7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test64");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService3 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService4 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService3);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test65");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture4 = multiBackgroundInitializer0.getFuture();
        boolean boolean5 = multiBackgroundInitializer0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test66");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults5 = multiBackgroundInitializer1.get();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults6 = multiBackgroundInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BackgroundInitializer<?> wildcardBackgroundInitializer8 = multiBackgroundInitializerResults6.getInitializer("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults6);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test67");
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer0 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer();
        boolean boolean1 = multiBackgroundInitializer0.start();
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer0.getExternalExecutor();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults3 = multiBackgroundInitializer0.get();
        boolean boolean4 = multiBackgroundInitializerResults3.isSuccessful();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.ConcurrentException concurrentException6 = multiBackgroundInitializerResults3.getException("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No child initializer with name hi!");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test68");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture5 = multiBackgroundInitializer1.getFuture();
        boolean boolean6 = multiBackgroundInitializer1.isStarted();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults7 = multiBackgroundInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults7);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test69");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture6 = multiBackgroundInitializer1.getFuture();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializerResults8 = multiBackgroundInitializer1.get();
        java.util.Set<java.lang.String> strSet9 = multiBackgroundInitializerResults8.initializerNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResults8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test70");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        boolean boolean6 = multiBackgroundInitializer1.start();
        java.util.concurrent.Future<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> multiBackgroundInitializerResultsFuture7 = multiBackgroundInitializer1.getFuture();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(multiBackgroundInitializerResultsFuture7);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test71");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        java.util.concurrent.ExecutorService executorService2 = multiBackgroundInitializer1.getExternalExecutor();
        boolean boolean3 = multiBackgroundInitializer1.start();
        boolean boolean4 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiBackgroundInitializer1.setExternalExecutor(executorService5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot set ExecutorService after start()!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiBackgroundInitializer0.test72");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.lang3.concurrent.MultiBackgroundInitializer multiBackgroundInitializer1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer(executorService0);
        boolean boolean2 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService3 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService3);
        boolean boolean5 = multiBackgroundInitializer1.isStarted();
        java.util.concurrent.ExecutorService executorService6 = multiBackgroundInitializer1.getExternalExecutor();
        java.util.concurrent.ExecutorService executorService7 = null;
        multiBackgroundInitializer1.setExternalExecutor(executorService7);
        boolean boolean9 = multiBackgroundInitializer1.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(executorService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

