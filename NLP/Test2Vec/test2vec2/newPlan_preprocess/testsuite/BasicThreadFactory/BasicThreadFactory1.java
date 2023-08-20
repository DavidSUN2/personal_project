package BasicThreadFactory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicThreadFactory1 {

    public static boolean debug = false;

    @Test
    public void BasicThreadFactory0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0501");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("");
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
    public void BasicThreadFactory0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0502");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0503");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0504");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0505");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.daemon(false);
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
    public void BasicThreadFactory0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0506");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0507");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0508");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0509");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        java.lang.String str9 = basicThreadFactory7.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0510");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0511");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) ' ');
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
    public void BasicThreadFactory0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0512");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Class<?> wildcardClass7 = basicThreadFactory5.getClass();
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
    public void BasicThreadFactory0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0513");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder2.reset();
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
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0514");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder6.build();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0515");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder5.reset();
        builder5.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        long long9 = basicThreadFactory8.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0516");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0517");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
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
    public void BasicThreadFactory0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0518");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
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
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0519");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority(100);
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
    public void BasicThreadFactory0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0520");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
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
    public void BasicThreadFactory0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0521");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0522");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
    public void BasicThreadFactory0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0523");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0524");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        java.lang.Class<?> wildcardClass8 = builder5.getClass();
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
    public void BasicThreadFactory0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0525");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority(0);
        builder0.reset();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0526");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) -1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0527");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority(100);
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
    public void BasicThreadFactory0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0528");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0529");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.daemon(false);
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
    public void BasicThreadFactory0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0530");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0531");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0532");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0533");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0534");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        long long7 = basicThreadFactory6.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0535");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        long long7 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0536");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        long long8 = basicThreadFactory5.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0537");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        java.lang.Boolean boolean9 = basicThreadFactory8.getDaemonFlag();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0538");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        long long7 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0539");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.priority((int) (byte) 0);
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
    public void BasicThreadFactory0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0540");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory6.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0541");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0542");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) -1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
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
    public void BasicThreadFactory0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0543");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
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
    public void BasicThreadFactory0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0544");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        builder2.reset();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0545");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.namingPattern("");
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
    public void BasicThreadFactory0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0546");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) (byte) 100);
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
    public void BasicThreadFactory0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0547");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0548");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(true);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.daemon(true);
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
    public void BasicThreadFactory0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0549");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory6.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0550");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
    }

    @Test
    public void BasicThreadFactory0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0551");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean5);
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
    public void BasicThreadFactory0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0552");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.priority((int) (short) 10);
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
    public void BasicThreadFactory0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0553");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder5.reset();
        builder5.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory8.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0554");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
    public void BasicThreadFactory0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0555");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.String str6 = basicThreadFactory5.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void BasicThreadFactory0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0556");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0557");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0558");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0559");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
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
    public void BasicThreadFactory0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0560");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("hi!");
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
    public void BasicThreadFactory0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0561");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0562");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        long long7 = basicThreadFactory6.getThreadCount();
        long long8 = basicThreadFactory6.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0563");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder0.build();
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
    public void BasicThreadFactory0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0564");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void BasicThreadFactory0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0565");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) (byte) 100);
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
    public void BasicThreadFactory0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0566");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((-1));
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0567");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
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
    public void BasicThreadFactory0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0568");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0569");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Boolean boolean6 = basicThreadFactory5.getDaemonFlag();
        long long7 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0570");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0571");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0572");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.String str9 = basicThreadFactory8.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0573");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void BasicThreadFactory0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0574");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0575");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0576");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0577");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        long long7 = basicThreadFactory3.getThreadCount();
        long long8 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0578");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0579");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory6.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory6.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0580");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory6.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0581");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory5.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory5.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void BasicThreadFactory0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0582");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        long long7 = basicThreadFactory5.getThreadCount();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0583");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority((int) (short) 0);
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
    public void BasicThreadFactory0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0584");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0585");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0586");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) -1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.daemon(true);
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
    public void BasicThreadFactory0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0587");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
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
    public void BasicThreadFactory0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0588");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0589");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0590");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
    }

    @Test
    public void BasicThreadFactory0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0591");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority((int) '4');
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
    public void BasicThreadFactory0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0592");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0593");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory5.getClass();
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
    public void BasicThreadFactory0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0594");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0595");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory4.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Integer int7 = basicThreadFactory4.getPriority();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0596");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0597");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0598");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Class<?> wildcardClass8 = builder6.getClass();
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
    public void BasicThreadFactory0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0599");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0600");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory4.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0601");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
    }

    @Test
    public void BasicThreadFactory0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0602");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
    public void BasicThreadFactory0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0603");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
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
    }

    @Test
    public void BasicThreadFactory0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0604");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) -1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.daemon(false);
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
    public void BasicThreadFactory0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0605");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
    }

    @Test
    public void BasicThreadFactory0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0606");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        long long9 = basicThreadFactory8.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0607");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        java.lang.Boolean boolean9 = basicThreadFactory7.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0608");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            java.lang.Class<?> wildcardClass8 = uncaughtExceptionHandler7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0609");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0610");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0611");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
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
    public void BasicThreadFactory0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0612");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0613");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0614");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0615");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(true);
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
    public void BasicThreadFactory0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0616");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        builder4.reset();
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
    }

    @Test
    public void BasicThreadFactory0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0617");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0618");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("hi!");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0619");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0620");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        builder5.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0621");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory5.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory5.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0622");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory4.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Boolean boolean8 = basicThreadFactory4.getDaemonFlag();
        java.lang.String str9 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0623");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory6.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0624");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        long long8 = basicThreadFactory6.getThreadCount();
        java.lang.Boolean boolean9 = basicThreadFactory6.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0625");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0626");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
    }

    @Test
    public void BasicThreadFactory0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0627");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) (short) 1);
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
    public void BasicThreadFactory0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0628");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
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
    public void BasicThreadFactory0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0629");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory6.getThreadCount();
        java.lang.String str9 = basicThreadFactory6.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0630");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) 100);
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
    public void BasicThreadFactory0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0631");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0632");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
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
    }

    @Test
    public void BasicThreadFactory0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0633");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0634");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
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
    public void BasicThreadFactory0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0635");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder5.reset();
        builder5.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0636");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        java.lang.String str9 = basicThreadFactory6.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0637");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
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
    public void BasicThreadFactory0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0638");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
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
    public void BasicThreadFactory0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0639");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0640");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.Integer int8 = basicThreadFactory5.getPriority();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0641");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
    }

    @Test
    public void BasicThreadFactory0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0642");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(true);
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
    public void BasicThreadFactory0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0643");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory6.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0644");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = basicThreadFactory4.newThread(runnable5);
        java.lang.String str7 = basicThreadFactory4.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory4.getWrappedFactory();
        java.lang.Integer int9 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread6.toString(), "Thread[pool-1133-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0645");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        builder0.reset();
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
    public void BasicThreadFactory0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0646");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        builder0.reset();
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0647");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder5.daemon(false);
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
    public void BasicThreadFactory0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0648");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) 100);
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
    public void BasicThreadFactory0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0649");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        long long9 = basicThreadFactory7.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0650");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0651");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void BasicThreadFactory0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0652");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0653");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        long long9 = basicThreadFactory8.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0654");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
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
    public void BasicThreadFactory0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0655");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.uncaughtExceptionHandler(uncaughtExceptionHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Uncaught exception handler must not be null!");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0656");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory4.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
    }

    @Test
    public void BasicThreadFactory0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0657");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0658");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void BasicThreadFactory0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0659");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0660");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
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
    public void BasicThreadFactory0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0661");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0662");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder5.build();
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
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0663");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("hi!");
        java.lang.Class<?> wildcardClass5 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BasicThreadFactory0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0664");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0665");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority(0);
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
    public void BasicThreadFactory0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0666");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        long long8 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0667");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority(97);
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
    public void BasicThreadFactory0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0668");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0669");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0670");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0671");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void BasicThreadFactory0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0672");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("hi!");
        builder4.reset();
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
    public void BasicThreadFactory0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0673");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0674");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory6.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory6.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0675");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) 100);
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
    public void BasicThreadFactory0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0676");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(false);
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
    public void BasicThreadFactory0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0677");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("hi!");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
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
    public void BasicThreadFactory0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0678");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0679");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder6.reset();
        builder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0680");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.String str5 = basicThreadFactory4.getNamingPattern();
        long long6 = basicThreadFactory4.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void BasicThreadFactory0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0681");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
    }

    @Test
    public void BasicThreadFactory0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0682");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
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
    public void BasicThreadFactory0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0683");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(true);
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
    public void BasicThreadFactory0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0684");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(false);
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
    public void BasicThreadFactory0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0685");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Boolean boolean6 = basicThreadFactory5.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory5.getPriority();
        java.lang.Integer int9 = basicThreadFactory5.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void BasicThreadFactory0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0686");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(true);
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0687");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0688");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0689");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0690");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority(0);
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
    public void BasicThreadFactory0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0691");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        long long7 = basicThreadFactory6.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0692");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
    }

    @Test
    public void BasicThreadFactory0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0693");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        builder4.reset();
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0694");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.daemon(false);
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
    public void BasicThreadFactory0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0695");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0696");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0697");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BasicThreadFactory0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0698");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        long long9 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0699");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0700");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) 100);
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
    public void BasicThreadFactory0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0701");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 0);
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0702");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0703");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0704");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0705");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
        builder5.reset();
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0706");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void BasicThreadFactory0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0707");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
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
    public void BasicThreadFactory0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0708");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
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
    public void BasicThreadFactory0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0709");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder4.reset();
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
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0710");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority(1);
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
    public void BasicThreadFactory0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0711");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        java.lang.Integer int9 = basicThreadFactory7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0712");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0713");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
    }

    @Test
    public void BasicThreadFactory0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0714");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) (byte) 1);
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
    public void BasicThreadFactory0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0715");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0716");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0717");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0718");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        java.lang.Class<?> wildcardClass9 = threadFactory8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0719");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0720");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0721");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(false);
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
    public void BasicThreadFactory0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0722");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0723");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) ' ');
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
    public void BasicThreadFactory0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0724");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void BasicThreadFactory0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0725");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        java.lang.String str9 = basicThreadFactory5.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0726");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        java.lang.Integer int9 = basicThreadFactory8.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0727");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        long long7 = basicThreadFactory6.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory6.getWrappedFactory();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0728");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory5.getPriority();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
    }

    @Test
    public void BasicThreadFactory0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0729");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0730");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0731");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0732");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0733");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0734");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority(10);
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
    public void BasicThreadFactory0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0735");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0736");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory4.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory4.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void BasicThreadFactory0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0737");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0738");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void BasicThreadFactory0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0739");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
        long long6 = basicThreadFactory3.getThreadCount();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread5.toString(), "Thread[pool-1263-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0740");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("");
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
    public void BasicThreadFactory0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0741");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0742");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0743");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0744");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0745");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        long long9 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0746");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
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
    public void BasicThreadFactory0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0747");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 10);
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
    public void BasicThreadFactory0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0748");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 10);
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
    public void BasicThreadFactory0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0749");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0750");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
    public void BasicThreadFactory0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0751");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0752");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0753");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0754");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0755");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0756");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0757");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        builder7.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0758");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0759");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0760");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory6.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory6.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0761");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
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
    public void BasicThreadFactory0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0762");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
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
    public void BasicThreadFactory0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0763");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority(0);
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.priority(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0764");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory7.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0765");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        long long8 = basicThreadFactory5.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0766");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) 'a');
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
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0767");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0768");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder6.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        long long9 = basicThreadFactory8.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0769");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        builder4.reset();
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
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0770");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0771");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0772");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0773");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0774");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0775");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = basicThreadFactory4.newThread(runnable5);
        java.lang.String str7 = basicThreadFactory4.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory4.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread6.toString(), "Thread[pool-1306-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0776");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(true);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
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
    public void BasicThreadFactory0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0777");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.namingPattern("hi!");
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.daemon(true);
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
    public void BasicThreadFactory0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0778");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void BasicThreadFactory0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0779");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0780");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0781");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void BasicThreadFactory0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0782");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
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
    public void BasicThreadFactory0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0783");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) '#');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.daemon(true);
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
    public void BasicThreadFactory0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0784");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
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
    public void BasicThreadFactory0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0785");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0786");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(true);
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
    public void BasicThreadFactory0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0787");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(true);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0788");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0789");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Class<?> wildcardClass6 = builder2.getClass();
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
    public void BasicThreadFactory0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0790");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("hi!");
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
    public void BasicThreadFactory0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0791");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
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
    public void BasicThreadFactory0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0792");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0793");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority(97);
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
    public void BasicThreadFactory0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0794");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (short) 1);
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
    public void BasicThreadFactory0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0795");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.String str5 = basicThreadFactory4.getNamingPattern();
        java.lang.String str6 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void BasicThreadFactory0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0796");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(false);
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
    public void BasicThreadFactory0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0797");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory3.getClass();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0798");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        java.lang.String str9 = basicThreadFactory6.getNamingPattern();
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0799");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void BasicThreadFactory0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0800");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0801");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0802");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
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
    public void BasicThreadFactory0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0803");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
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
    public void BasicThreadFactory0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0804");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
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
    public void BasicThreadFactory0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0805");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0806");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder5.priority((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = builder5.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0807");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0808");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.String str8 = basicThreadFactory7.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory7.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0809");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
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
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0810");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BasicThreadFactory0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0811");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
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
    public void BasicThreadFactory0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0812");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0813");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0814");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        java.lang.Class<?> wildcardClass8 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0815");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0816");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.String str5 = basicThreadFactory4.getNamingPattern();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void BasicThreadFactory0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0817");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
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
    public void BasicThreadFactory0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0818");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0819");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0820");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        long long9 = basicThreadFactory8.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0821");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        long long8 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0822");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (short) 1);
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
    public void BasicThreadFactory0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0823");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        java.lang.String str9 = basicThreadFactory7.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0824");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0825");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority((int) (byte) 10);
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
    public void BasicThreadFactory0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0826");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0827");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0828");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
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
    public void BasicThreadFactory0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0829");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0830");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Integer int7 = basicThreadFactory5.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0831");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority(97);
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
    public void BasicThreadFactory0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0832");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Class<?> wildcardClass6 = basicThreadFactory3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0833");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (byte) 0);
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
    public void BasicThreadFactory0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0834");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0835");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
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
    public void BasicThreadFactory0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0836");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority((int) (short) 100);
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
    public void BasicThreadFactory0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0837");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority(100);
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
    public void BasicThreadFactory0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0838");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) (byte) 100);
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
    public void BasicThreadFactory0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0839");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory8.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0840");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
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
    public void BasicThreadFactory0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0841");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        builder5.reset();
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
    public void BasicThreadFactory0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0842");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
    }

    @Test
    public void BasicThreadFactory0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0843");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0844");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder5.priority((int) (byte) 100);
        builder5.reset();
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
    public void BasicThreadFactory0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0845");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0846");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0847");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority(0);
        builder0.reset();
        builder0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0848");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0849");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0850");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
    public void BasicThreadFactory0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0851");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        builder5.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
    public void BasicThreadFactory0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0852");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.String str7 = basicThreadFactory6.getNamingPattern();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void BasicThreadFactory0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0853");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        long long8 = basicThreadFactory5.getThreadCount();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0854");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
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
    public void BasicThreadFactory0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0855");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
    public void BasicThreadFactory0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0856");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder2.build();
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
    public void BasicThreadFactory0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0857");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("");
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
    public void BasicThreadFactory0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0858");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0859");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory5.getDaemonFlag();
        long long8 = basicThreadFactory5.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0860");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0861");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0862");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0863");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0864");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
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
    public void BasicThreadFactory0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0865");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0866");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("hi!");
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
    public void BasicThreadFactory0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0867");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0868");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0869");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
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
    public void BasicThreadFactory0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0870");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0871");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.String str5 = basicThreadFactory4.getNamingPattern();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        java.lang.Runnable runnable7 = null;
        java.lang.Thread thread8 = basicThreadFactory4.newThread(runnable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread8.toString(), "Thread[pool-1409-thread-1,5,main]");
    }

    @Test
    public void BasicThreadFactory0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0872");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0873");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder2.build();
        java.lang.Integer int9 = basicThreadFactory8.getPriority();
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
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0874");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder7.build();
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
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0875");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0876");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0877");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0878");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0879");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0880");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        long long9 = basicThreadFactory8.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0881");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.daemon(false);
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
    public void BasicThreadFactory0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0882");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory5.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0883");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory6.getUncaughtExceptionHandler();
        java.lang.String str9 = basicThreadFactory6.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0884");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0885");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0886");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0887");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
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
    public void BasicThreadFactory0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0888");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) (short) 1);
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
    public void BasicThreadFactory0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0889");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0890");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void BasicThreadFactory0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0891");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
    public void BasicThreadFactory0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0892");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0893");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0894");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0895");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Boolean boolean6 = basicThreadFactory4.getDaemonFlag();
        long long7 = basicThreadFactory4.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void BasicThreadFactory0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0896");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        java.lang.String str6 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void BasicThreadFactory0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0897");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
    }

    @Test
    public void BasicThreadFactory0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0898");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 0);
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
    public void BasicThreadFactory0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0899");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0900");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        long long7 = basicThreadFactory6.getThreadCount();
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
    }

    @Test
    public void BasicThreadFactory0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0901");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
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
    public void BasicThreadFactory0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0902");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) -1);
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0903");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("hi!");
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
    public void BasicThreadFactory0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0904");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("");
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
    public void BasicThreadFactory0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0905");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
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
    public void BasicThreadFactory0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0906");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
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
    public void BasicThreadFactory0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0907");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority((int) (byte) 1);
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
    public void BasicThreadFactory0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0908");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority(1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0909");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0910");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        long long8 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0911");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        long long7 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0912");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
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
    public void BasicThreadFactory0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0913");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("hi!");
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
    public void BasicThreadFactory0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0914");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.namingPattern("hi!");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0915");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread5.toString(), "Thread[pool-1461-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0916");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = basicThreadFactory4.newThread(runnable5);
        java.lang.String str7 = basicThreadFactory4.getNamingPattern();
        java.lang.Boolean boolean8 = basicThreadFactory4.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread6.toString(), "Thread[pool-1464-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0917");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in BasicThreadFactory generation
        try {
            org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder5.uncaughtExceptionHandler(uncaughtExceptionHandler7);
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
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0918");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0919");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(true);
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
    public void BasicThreadFactory0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0920");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Integer int9 = basicThreadFactory8.getPriority();
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
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0921");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory8.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0922");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Integer int7 = basicThreadFactory6.getPriority();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7.equals(97));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0923");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0924");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0925");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0926");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0927");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
    }

    @Test
    public void BasicThreadFactory0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0928");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        builder0.reset();
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
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0929");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0930");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int8 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0931");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Boolean boolean6 = basicThreadFactory5.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory5.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0932");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0933");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        builder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0934");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) 'a');
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
    public void BasicThreadFactory0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0935");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0936");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.Integer int8 = basicThreadFactory5.getPriority();
        java.lang.String str9 = basicThreadFactory5.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0937");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
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
    public void BasicThreadFactory0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0938");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority((int) '4');
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
    public void BasicThreadFactory0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0939");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
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
    public void BasicThreadFactory0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0940");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        builder4.reset();
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0941");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0942");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory8.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0943");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority(0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.daemon(false);
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
    public void BasicThreadFactory0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0944");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        builder6.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0945");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BasicThreadFactory0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0946");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0947");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) '4');
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
    public void BasicThreadFactory0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0948");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("");
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
    public void BasicThreadFactory0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0949");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) -1);
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
    public void BasicThreadFactory0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0950");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.String str8 = basicThreadFactory7.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory9 = basicThreadFactory7.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0951");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
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
    public void BasicThreadFactory0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0952");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.priority((int) ' ');
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
    public void BasicThreadFactory0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0953");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = basicThreadFactory4.newThread(runnable5);
        long long7 = basicThreadFactory4.getThreadCount();
        java.lang.Class<?> wildcardClass8 = basicThreadFactory4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread6.toString(), "Thread[pool-1514-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0954");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(false);
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
    public void BasicThreadFactory0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0955");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0956");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.lang.Boolean boolean6 = basicThreadFactory5.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0957");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0958");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority(10);
        java.lang.Class<?> wildcardClass8 = builder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0959");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.daemon(true);
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
    public void BasicThreadFactory0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0960");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0961");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void BasicThreadFactory0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0962");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(true);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0963");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0964");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0965");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
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
    public void BasicThreadFactory0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0966");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
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
    public void BasicThreadFactory0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0967");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0968");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.daemon(false);
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
    public void BasicThreadFactory0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0969");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0970");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0971");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.daemon(true);
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
    public void BasicThreadFactory0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0972");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        long long8 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0973");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0974");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.priority((int) (short) 10);
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
    public void BasicThreadFactory0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0975");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0976");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        long long9 = basicThreadFactory7.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0977");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
        java.lang.String str8 = basicThreadFactory5.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0978");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        builder4.reset();
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
    public void BasicThreadFactory0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0979");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.priority(100);
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
    public void BasicThreadFactory0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0980");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        builder2.reset();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0981");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int9 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0982");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0983");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
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
    public void BasicThreadFactory0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0984");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0985");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void BasicThreadFactory0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0986");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        long long9 = basicThreadFactory6.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0987");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = basicThreadFactory4.newThread(runnable5);
        long long7 = basicThreadFactory4.getThreadCount();
        java.lang.String str8 = basicThreadFactory4.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread6);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread6.toString(), "Thread[pool-1549-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0988");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Integer int9 = basicThreadFactory8.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0989");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void BasicThreadFactory0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0990");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) (byte) 100);
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
    public void BasicThreadFactory0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0991");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str9 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0992");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
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
    public void BasicThreadFactory0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0993");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
    public void BasicThreadFactory0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0994");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0995");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        long long5 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0996");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0997");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass6 = threadFactory5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0998");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory0999");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
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
    public void BasicThreadFactory1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.BasicThreadFactory1000");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory7.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }
}
