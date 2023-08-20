
package BasicThreadFactory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicThreadFactory0 {

    public static boolean debug = false;

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test01");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        java.util.concurrent.ThreadFactory threadFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.wrappedFactory(threadFactory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Wrapped ThreadFactory must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test02");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test03");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        builder2.reset();
        java.lang.Class<?> wildcardClass4 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test04");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test05");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        long long4 = basicThreadFactory1.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test06");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        java.lang.Class<?> wildcardClass3 = basicThreadFactory1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test07");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test08");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.lang.Integer int4 = basicThreadFactory1.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test09");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test10");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test11");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = builder0.priority(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test12");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test13");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        java.util.concurrent.ThreadFactory threadFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.wrappedFactory(threadFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Wrapped ThreadFactory must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test14");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = basicThreadFactory1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test15");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test16");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(false);
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test17");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory1.getWrappedFactory();
        long long5 = basicThreadFactory1.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test18");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test19");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory1.getWrappedFactory();
        java.lang.Integer int5 = basicThreadFactory1.getPriority();
        long long6 = basicThreadFactory1.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test20");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test21");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        java.lang.String str3 = basicThreadFactory1.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test22");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.String str8 = basicThreadFactory7.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test23");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test24");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.Integer int4 = basicThreadFactory1.getPriority();
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = basicThreadFactory1.newThread(runnable5);
        java.lang.String str7 = basicThreadFactory1.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread6.toString(), "Thread[pool-29-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test25");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test26");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test27");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        builder4.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test28");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test29");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.lang.Boolean boolean4 = basicThreadFactory1.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test30");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        long long3 = basicThreadFactory1.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test31");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory1.getWrappedFactory();
        java.lang.Integer int5 = basicThreadFactory1.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory1.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test32");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority(10);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test33");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = basicThreadFactory1.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test34");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory1.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory1.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test35");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test36");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test37");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.Integer int4 = basicThreadFactory1.getPriority();
        java.lang.String str5 = basicThreadFactory1.getNamingPattern();
        java.lang.String str6 = basicThreadFactory1.getNamingPattern();
        java.lang.String str7 = basicThreadFactory1.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test38");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.String str4 = basicThreadFactory1.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory1.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test39");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.Integer int4 = basicThreadFactory1.getPriority();
        java.lang.String str5 = basicThreadFactory1.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory1.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory1.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test40");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = basicThreadFactory1.getUncaughtExceptionHandler();
        java.lang.Boolean boolean4 = basicThreadFactory1.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test41");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test42");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 1);
        builder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test43");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test44");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test45");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test46");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test47");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        long long2 = basicThreadFactory1.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory3 = basicThreadFactory1.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory3);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test48");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test49");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.Integer int4 = basicThreadFactory1.getPriority();
        java.lang.String str5 = basicThreadFactory1.getNamingPattern();
        java.lang.String str6 = basicThreadFactory1.getNamingPattern();
        java.lang.Integer int7 = basicThreadFactory1.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test50");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) '4');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test51");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory1 = builder0.build();
        java.lang.Boolean boolean2 = basicThreadFactory1.getDaemonFlag();
        java.lang.Integer int3 = basicThreadFactory1.getPriority();
        java.lang.Integer int4 = basicThreadFactory1.getPriority();
        java.lang.String str5 = basicThreadFactory1.getNamingPattern();
        long long6 = basicThreadFactory1.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test52");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        builder2.reset();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.test53");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}
