
package BasicThreadFactory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicThreadFactory1 {

    public static boolean debug = false;

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0501");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0502");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0503");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0504");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0505");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0506");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0507");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0508");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0509");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0510");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0511");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0512");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0513");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder2.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0514");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0515");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0516");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0517");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0518");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0519");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0520");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0521");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0522");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0523");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0524");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0525");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0526");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0527");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0528");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0529");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0530");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0531");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0532");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0533");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0534");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0535");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0536");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0537");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0538");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0539");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0540");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0541");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0542");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0543");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
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
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0544");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0545");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0546");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0547");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0548");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0549");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0550");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0551");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0552");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0553");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0554");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0555");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0556");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0557");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0558");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0559");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (byte) 10);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0560");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0561");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0562");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0563");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0564");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0565");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0566");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0567");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0568");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0569");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0570");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0571");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0572");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0573");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0574");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0575");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0576");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0577");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0578");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0579");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0580");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0581");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0582");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0583");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0584");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0585");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0586");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0587");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0588");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0589");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0590");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0591");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0592");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0593");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0594");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0595");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0596");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0597");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0598");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0599");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0600");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0601");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0602");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0603");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0604");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0605");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0606");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0607");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0608");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0609");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0610");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0611");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0612");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0613");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0614");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0615");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(true);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0616");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        builder4.reset();
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
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0617");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0618");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("hi!");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0619");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0620");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0621");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0622");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0623");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0624");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0625");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0626");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0627");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0628");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0629");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0630");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) 100);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0631");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0632");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0633");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0634");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0635");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0636");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0637");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0638");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0639");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0640");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0641");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0642");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0643");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0644");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0645");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0646");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0647");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0648");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0649");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0650");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0651");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0652");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0653");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0654");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0655");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0656");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0657");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0658");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0659");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0660");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0661");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0662");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0663");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0664");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0665");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0666");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0667");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0668");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0669");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0670");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0671");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0672");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0673");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0674");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0675");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0676");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0677");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0678");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0679");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0680");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0681");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0682");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0683");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0684");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0685");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0686");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0687");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0688");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0689");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0690");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0691");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0692");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0693");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0694");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0695");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0696");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0697");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0698");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0699");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0700");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0701");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0702");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0703");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0704");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0705");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0706");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0707");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0708");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0709");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
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
            System.out.format("%n%s%n", "BasicThreadFactory1.test0710");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0711");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0712");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0713");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0714");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0715");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0716");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0717");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0718");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0719");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0720");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0721");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0722");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0723");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0724");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0725");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0726");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0727");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0728");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0729");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0730");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0731");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0732");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0733");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0734");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0735");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0736");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0737");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0738");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0739");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0740");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0741");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0742");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0743");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0744");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0745");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0746");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        builder6.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0747");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0748");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0749");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0750");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0751");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0752");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0753");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0754");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0755");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0756");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0757");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0758");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0759");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0760");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0761");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0762");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0763");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0764");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0765");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0766");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) 'a');
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0767");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0768");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0769");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0770");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0771");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0772");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0773");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0774");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0775");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0776");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0777");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0778");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0779");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0780");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0781");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0782");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0783");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0784");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0785");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0786");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0787");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0788");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0789");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0790");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0791");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0792");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0793");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0794");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0795");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0796");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0797");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0798");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0799");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0800");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0801");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0802");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0803");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0804");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("");
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0805");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0806");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0807");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0808");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0809");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0810");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0811");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0812");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0813");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0814");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0815");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0816");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0817");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0818");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0819");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0820");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0821");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0822");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (short) 1);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0823");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0824");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0825");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0826");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0827");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0828");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0829");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0830");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0831");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0832");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0833");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0834");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0835");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0836");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0837");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0838");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0839");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0840");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0841");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0842");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0843");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0844");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0845");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0846");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0847");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0848");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0849");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0850");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0851");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        builder5.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0852");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0853");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0854");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0855");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0856");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0857");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0858");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0859");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0860");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0861");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0862");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0863");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0864");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0865");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0866");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0867");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0868");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0869");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0870");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0871");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0872");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0873");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0874");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0875");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0876");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0877");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0878");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0879");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0880");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0881");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0882");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0883");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0884");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0885");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0886");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0887");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0888");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0889");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0890");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0891");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0892");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0893");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0894");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0895");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0896");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0897");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0898");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0899");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0900");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0901");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0902");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0903");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0904");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0905");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0906");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0907");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0908");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0909");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0910");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0911");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0912");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0913");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0914");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0915");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0916");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0917");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0918");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0919");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0920");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0921");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0922");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0923");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0924");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0925");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0926");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0927");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0928");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        builder0.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0929");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0930");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0931");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0932");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0933");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0934");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0935");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0936");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0937");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0938");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0939");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0940");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0941");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0942");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0943");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0944");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0945");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0946");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0947");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0948");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0949");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) -1);
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
            System.out.format("%n%s%n", "BasicThreadFactory1.test0950");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0951");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0952");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0953");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0954");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0955");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0956");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0957");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0958");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0959");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0960");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0961");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0962");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0963");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0964");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0965");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        builder4.reset();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0966");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0967");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0968");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0969");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0970");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0971");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0972");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0973");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0974");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0975");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0976");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0977");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0978");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0979");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0980");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        builder2.reset();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0981");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0982");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0983");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0984");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0985");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0986");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0987");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0988");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0989");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0990");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0991");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0992");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0993");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0994");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0995");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0996");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0997");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0998");
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test0999");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.daemon(false);
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = null;
        // The following exception was thrown during execution in test generation
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
    public void BasicThreadFactory() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory1.test1000");
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
