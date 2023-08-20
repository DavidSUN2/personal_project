package BasicThreadFactory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicThreadFactory0 {

    public static boolean debug = false;

    @Test
    public void BasicThreadFactory0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0001");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        java.lang.Class<?> wildcardClass8 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0002");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler5);
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
    public void BasicThreadFactory0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0003");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("");
        java.lang.Class<?> wildcardClass9 = builder2.getClass();
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
    public void BasicThreadFactory0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0004");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        java.util.concurrent.ThreadFactory threadFactory5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.wrappedFactory(threadFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Wrapped ThreadFactory must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0005");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0006");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BasicThreadFactory0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BasicThreadFactory0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0008");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0009");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0010");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder2.build();
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
    public void BasicThreadFactory0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0011");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Class<?> wildcardClass6 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0012");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.namingPattern("hi!");
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
    public void BasicThreadFactory0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0013");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0014");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0015");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0016");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0017");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler1 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void BasicThreadFactory0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0018");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0019");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
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
    public void BasicThreadFactory0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0020");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0021");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.namingPattern("hi!");
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
    public void BasicThreadFactory0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0022");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        builder2.reset();
        java.lang.Class<?> wildcardClass8 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0023");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread8 = basicThreadFactory3.newThread(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void BasicThreadFactory0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0024");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
    public void BasicThreadFactory0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0025");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0026");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0027");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0028");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread8 = basicThreadFactory3.newThread(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
    }

    @Test
    public void BasicThreadFactory0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0029");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0030");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0031");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0032");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0033");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0034");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread7 = basicThreadFactory3.newThread(runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void BasicThreadFactory0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0035");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0036");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread8 = basicThreadFactory3.newThread(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
    }

    @Test
    public void BasicThreadFactory0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0037");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0038");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
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
    public void BasicThreadFactory0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0039");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
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
    public void BasicThreadFactory0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0040");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0041");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0042");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0043");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0044");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0045");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass6 = threadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0046");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        builder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0047");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BasicThreadFactory0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0048");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
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
    public void BasicThreadFactory0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0049");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0050");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0051");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
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
    public void BasicThreadFactory0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0052");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0053");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0054");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0055");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread8 = basicThreadFactory3.newThread(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void BasicThreadFactory0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0056");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0057");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
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
    public void BasicThreadFactory0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0058");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0059");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0060");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void BasicThreadFactory0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0061");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
        builder6.reset();
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
    public void BasicThreadFactory0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0062");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0063");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0064");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0065");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread8 = basicThreadFactory3.newThread(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
    }

    @Test
    public void BasicThreadFactory0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0066");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority((int) (byte) 0);
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
    public void BasicThreadFactory0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0067");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0068");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0069");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0070");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) (byte) 0);
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
    public void BasicThreadFactory0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0071");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory7.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory7.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0072");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) (short) 0);
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
    public void BasicThreadFactory0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0073");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void BasicThreadFactory0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0074");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0075");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0076");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0077");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0078");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0079");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
        java.lang.Class<?> wildcardClass6 = thread5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread5.toString(), "Thread[pool-151-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0080");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0081");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        java.lang.String str7 = basicThreadFactory6.getNamingPattern();
        java.lang.String str8 = basicThreadFactory6.getNamingPattern();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0082");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0083");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0084");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder2.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0085");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory3.getThreadCount();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0086");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0087");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.priority((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0088");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("");
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
    public void BasicThreadFactory0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0089");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0090");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0091");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority(1);
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
    public void BasicThreadFactory0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0092");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        builder2.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler8);
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
    public void BasicThreadFactory0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0093");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0094");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0095");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0096");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0097");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0098");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0099");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        java.lang.String str9 = basicThreadFactory8.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0100");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
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
    public void BasicThreadFactory0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0101");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0102");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BasicThreadFactory0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0103");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0104");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0105");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0106");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory8.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0107");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        java.lang.Class<?> wildcardClass6 = builder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0108");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0109");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0110");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        long long8 = basicThreadFactory7.getThreadCount();
        java.lang.String str9 = basicThreadFactory7.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0111");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0112");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0113");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0114");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0115");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
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
    public void BasicThreadFactory0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0116");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0117");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("");
        builder2.reset();
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
    public void BasicThreadFactory0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0118");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0119");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0120");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0121");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0122");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        java.lang.Class<?> wildcardClass8 = builder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0123");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0124");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Class<?> wildcardClass4 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BasicThreadFactory0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0125");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BasicThreadFactory0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0126");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0127");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(true);
        builder7.reset();
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0128");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0129");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0130");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
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
    public void BasicThreadFactory0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0131");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0132");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0133");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0134");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0135");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0136");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0137");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0138");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0139");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0140");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.String str9 = basicThreadFactory8.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0141");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0142");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0143");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        long long6 = basicThreadFactory3.getThreadCount();
        long long7 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0144");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        long long8 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0145");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass6 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0146");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.lang.String str6 = basicThreadFactory5.getNamingPattern();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0147");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        long long7 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0148");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0149");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0150");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0151");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0152");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0153");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0154");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0155");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0156");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0157");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0158");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler6);
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
    public void BasicThreadFactory0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0159");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.priority((int) (short) 1);
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
    public void BasicThreadFactory0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0160");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0161");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0162");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0163");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
    }

    @Test
    public void BasicThreadFactory0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0164");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void BasicThreadFactory0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0165");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder4.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler6);
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
    public void BasicThreadFactory0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0166");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory5.getPriority();
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0167");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0168");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0169");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.priority((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = builder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0170");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0171");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0172");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(false);
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0173");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0174");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0175");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0176");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0177");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0178");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0179");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0180");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0181");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass6 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0182");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0183");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0184");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0185");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder0.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0186");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        long long9 = basicThreadFactory8.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0187");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0188");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void BasicThreadFactory0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0189");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0190");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0191");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread7 = basicThreadFactory5.newThread(runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0192");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0193");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        long long8 = basicThreadFactory5.getThreadCount();
        java.lang.Integer int9 = basicThreadFactory5.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void BasicThreadFactory0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0194");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0195");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
        long long9 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0196");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        long long8 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0197");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0198");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        long long8 = basicThreadFactory7.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0199");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(false);
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
    public void BasicThreadFactory0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0200");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory8.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0201");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.namingPattern("");
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
    public void BasicThreadFactory0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0202");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0203");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.String str6 = basicThreadFactory5.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0204");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0205");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("");
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
    public void BasicThreadFactory0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0206");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("");
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BasicThreadFactory0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0207");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        builder2.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0208");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0209");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0210");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        builder2.reset();
        builder2.reset();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0211");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0212");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0213");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0214");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0215");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread7 = basicThreadFactory3.newThread(runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
    }

    @Test
    public void BasicThreadFactory0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0216");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0217");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0218");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0219");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder4.reset();
        java.lang.Class<?> wildcardClass6 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0220");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0221");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0222");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0223");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0224");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void BasicThreadFactory0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0225");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
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
    public void BasicThreadFactory0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0226");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0227");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) '4');
        builder6.reset();
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
    public void BasicThreadFactory0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0228");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority((int) ' ');
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
    public void BasicThreadFactory0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0229");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0230");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0231");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        builder2.reset();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0232");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BasicThreadFactory0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0233");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        long long9 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0234");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) '4');
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
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
    public void BasicThreadFactory0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0235");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.priority((int) (short) 100);
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0236");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void BasicThreadFactory0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0237");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0238");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Class<?> wildcardClass7 = threadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0239");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void BasicThreadFactory0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0240");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0241");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0242");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder2.build();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0243");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0244");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0245");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory6.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory6.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0246");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread8 = basicThreadFactory3.newThread(runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void BasicThreadFactory0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0247");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = threadFactory7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0248");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void BasicThreadFactory0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0249");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0250");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0251");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0252");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
    public void BasicThreadFactory0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0253");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0254");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0255");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void BasicThreadFactory0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0256");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0257");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
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
    public void BasicThreadFactory0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0258");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.priority((-1));
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
    public void BasicThreadFactory0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0259");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0260");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0261");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.daemon(false);
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
    public void BasicThreadFactory0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0262");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0263");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0264");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0265");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0266");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
    }

    @Test
    public void BasicThreadFactory0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0267");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0268");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void BasicThreadFactory0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0269");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        builder7.reset();
        java.lang.Class<?> wildcardClass9 = builder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0270");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0271");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0272");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        builder2.reset();
        builder2.reset();
        builder2.reset();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0273");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0274");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0275");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0276");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
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
    public void BasicThreadFactory0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0277");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0278");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        builder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0279");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0280");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0281");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory5.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void BasicThreadFactory0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0282");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void BasicThreadFactory0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0283");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        long long6 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void BasicThreadFactory0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0284");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0285");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass6 = threadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0286");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0287");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        java.lang.String str9 = basicThreadFactory6.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0288");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 0);
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0289");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0290");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BasicThreadFactory0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0291");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0292");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) ' ');
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
    public void BasicThreadFactory0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0293");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0294");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) ' ');
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
    public void BasicThreadFactory0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0295");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0296");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        builder7.reset();
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0297");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory4.getThreadCount();
        long long7 = basicThreadFactory4.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0298");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0299");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Class<?> wildcardClass6 = uncaughtExceptionHandler5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
    }

    @Test
    public void BasicThreadFactory0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0300");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0301");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
    public void BasicThreadFactory0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0302");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority(0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0303");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
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
    public void BasicThreadFactory0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0304");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0305");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0306");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
        builder6.reset();
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
    public void BasicThreadFactory0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0307");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory6.getUncaughtExceptionHandler();
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Class<?> wildcardClass9 = uncaughtExceptionHandler8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0308");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0309");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(true);
        builder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0310");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Thread thread7 = basicThreadFactory3.newThread(runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
    }

    @Test
    public void BasicThreadFactory0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0311");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0312");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory7.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0313");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0314");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0315");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
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
    public void BasicThreadFactory0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0316");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0317");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0318");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0319");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 10);
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
    public void BasicThreadFactory0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0320");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = threadFactory7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0321");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.String str5 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void BasicThreadFactory0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0322");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder0.reset();
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0323");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Class<?> wildcardClass6 = basicThreadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0324");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.daemon(true);
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
    public void BasicThreadFactory0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0325");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory6.getWrappedFactory();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0326");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void BasicThreadFactory0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0327");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
    public void BasicThreadFactory0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0328");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0329");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0330");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0331");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0332");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority(0);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0333");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (byte) 1);
        builder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0334");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0335");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0336");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0337");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(false);
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
    public void BasicThreadFactory0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0338");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0339");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0340");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0341");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0342");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0343");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory4.getNamingPattern();
        java.lang.String str7 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0344");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0345");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0346");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0347");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int9 = basicThreadFactory5.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void BasicThreadFactory0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0348");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        builder2.reset();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.priority(0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0349");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0350");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        java.lang.String str7 = basicThreadFactory6.getNamingPattern();
        java.lang.String str8 = basicThreadFactory6.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0351");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0352");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0353");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        java.lang.Integer int9 = basicThreadFactory5.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0354");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority(0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0355");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0356");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0357");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("hi!");
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
    public void BasicThreadFactory0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0358");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0359");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0360");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        builder2.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0361");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0362");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        builder6.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler8);
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
    public void BasicThreadFactory0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0363");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0364");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0365");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0366");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0367");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0368");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0369");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.String str9 = basicThreadFactory8.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void BasicThreadFactory0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0370");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0371");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory8.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0372");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (short) 1);
        builder7.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0373");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0374");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
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
    public void BasicThreadFactory0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0375");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0376");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0377");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (short) 1);
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0378");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0379");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0380");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void BasicThreadFactory0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0381");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.String str8 = basicThreadFactory6.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0382");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory6.getWrappedFactory();
        java.lang.Integer int9 = basicThreadFactory6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0383");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0384");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0385");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0386");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.daemon(false);
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
    public void BasicThreadFactory0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0387");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread5.toString(), "Thread[pool-757-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void BasicThreadFactory0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0388");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0389");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0390");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0391");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0392");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory5.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0393");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.priority((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0394");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
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
    public void BasicThreadFactory0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0395");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0396");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("hi!");
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
    public void BasicThreadFactory0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0397");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void BasicThreadFactory0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0398");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("hi!");
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
    public void BasicThreadFactory0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0399");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory5.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0400");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0401");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass6 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0402");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0403");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory5.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0404");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0405");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory3.getThreadCount();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0406");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder4.build();
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
    public void BasicThreadFactory0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0407");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0408");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0409");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("");
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0410");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0411");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("hi!");
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0412");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0413");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0414");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.uncaughtExceptionHandler(uncaughtExceptionHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0415");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0416");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory4.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0417");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder5.reset();
        builder5.reset();
        builder5.reset();
        java.lang.Class<?> wildcardClass9 = builder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0418");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
    }

    @Test
    public void BasicThreadFactory0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0419");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        java.lang.Integer int9 = basicThreadFactory8.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0420");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0421");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0422");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        long long9 = basicThreadFactory7.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0423");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0424");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) (byte) 100);
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
    public void BasicThreadFactory0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0425");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        builder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0426");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0427");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.priority((int) (byte) 10);
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
    public void BasicThreadFactory0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0428");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0429");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0430");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void BasicThreadFactory0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0431");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Class<?> wildcardClass8 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0432");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory7.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0433");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0434");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0435");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0436");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0437");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Class<?> wildcardClass9 = builder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0438");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0439");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory5.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
        java.lang.String str9 = basicThreadFactory5.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0440");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Class<?> wildcardClass7 = uncaughtExceptionHandler6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
    }

    @Test
    public void BasicThreadFactory0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0441");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        java.lang.String str9 = basicThreadFactory7.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0442");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        java.lang.String str9 = basicThreadFactory8.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0443");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0444");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0445");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0446");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0447");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0448");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        long long8 = basicThreadFactory7.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0449");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0450");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        java.lang.Class<?> wildcardClass6 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0451");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        long long9 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0452");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory4.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0453");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.Runnable runnable7 = null;
        java.lang.Thread thread8 = basicThreadFactory5.newThread(runnable7);
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!,1,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0454");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0455");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread5.toString(), "Thread[pool-885-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void BasicThreadFactory0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0456");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority(100);
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
    public void BasicThreadFactory0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0457");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0458");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0459");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0460");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0461");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.uncaughtExceptionHandler(uncaughtExceptionHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0462");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("");
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0463");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0464");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 1);
        builder8.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0465");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BasicThreadFactory0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0466");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0467");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0468");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0469");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0470");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0471");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
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
    public void BasicThreadFactory0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0472");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory7.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BasicThreadFactory0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0473");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = threadFactory7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0474");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority(0);
        builder0.reset();
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
    public void BasicThreadFactory0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0475");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0476");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        long long9 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0477");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0478");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0479");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
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
    public void BasicThreadFactory0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0480");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0481");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0482");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory6.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory6.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0483");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0484");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0485");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0486");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0487");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0488");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        java.lang.Class<?> wildcardClass8 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0489");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory4.getNamingPattern();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0490");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0491");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0492");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory7.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0493");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder5.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0494");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler5);
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
    public void BasicThreadFactory0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0495");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        long long7 = basicThreadFactory5.getThreadCount();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0496");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0497");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0498");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0499");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory0.BasicThreadFactory0500");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.priority(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }
}
