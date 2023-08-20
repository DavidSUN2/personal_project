package BasicThreadFactory;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BasicThreadFactory2 {

    public static boolean debug = false;

    @Test
    public void BasicThreadFactory1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1001");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1002");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory4.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Integer int7 = basicThreadFactory4.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory4.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1003");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
        builder4.reset();
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
    public void BasicThreadFactory1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1004");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("hi!");
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
    public void BasicThreadFactory1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1005");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
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
    public void BasicThreadFactory1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1006");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1007");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder4.build();
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
    public void BasicThreadFactory1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1008");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.Boolean boolean8 = basicThreadFactory6.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory6.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1009");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        builder2.reset();
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
    public void BasicThreadFactory1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1010");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority((int) '4');
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
    public void BasicThreadFactory1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1011");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1012");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
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
    public void BasicThreadFactory1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1013");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority(0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.namingPattern("");
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
    public void BasicThreadFactory1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1014");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = basicThreadFactory5.newThread(runnable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!,5,main]");
    }

    @Test
    public void BasicThreadFactory1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1015");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.priority((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1016");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BasicThreadFactory1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1017");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void BasicThreadFactory1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1018");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1019");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
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
    public void BasicThreadFactory1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1020");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory4.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory4.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory4.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1021");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory7.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void BasicThreadFactory1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1022");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.priority(1);
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
    public void BasicThreadFactory1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1023");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.priority((int) 'a');
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
    public void BasicThreadFactory1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1024");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void BasicThreadFactory1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1025");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void BasicThreadFactory1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1026");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
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
    public void BasicThreadFactory1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1027");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder2.daemon(true);
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
    public void BasicThreadFactory1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1028");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder0.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory4.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory4.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory4.getWrappedFactory();
        long long8 = basicThreadFactory4.getThreadCount();
        java.lang.Integer int9 = basicThreadFactory4.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1029");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
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
    public void BasicThreadFactory1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1030");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
    }

    @Test
    public void BasicThreadFactory1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1031");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder0.priority(100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder0.build();
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
    public void BasicThreadFactory1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1032");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1033");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory7.getWrappedFactory();
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
    public void BasicThreadFactory1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1034");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1035");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        builder2.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
    }

    @Test
    public void BasicThreadFactory1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1036");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("");
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
    public void BasicThreadFactory1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1037");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1038");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory5.getWrappedFactory();
        long long8 = basicThreadFactory5.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1039");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = basicThreadFactory3.newThread(runnable4);
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(thread5.toString(), "Thread[pool-1603-thread-1,5,main]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1040");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1041");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void BasicThreadFactory1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1042");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
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
    public void BasicThreadFactory1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1043");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(true);
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
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1044");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.priority((int) (short) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
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
    public void BasicThreadFactory1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1045");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.daemon(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1046");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1047");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.priority((int) (short) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder6.priority((int) 'a');
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
    public void BasicThreadFactory1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1048");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        long long8 = basicThreadFactory7.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void BasicThreadFactory1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1049");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        long long8 = basicThreadFactory6.getThreadCount();
        java.lang.Integer int9 = basicThreadFactory6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1050");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (byte) 10);
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.namingPattern("");
        builder7.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory9);
    }

    @Test
    public void BasicThreadFactory1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1051");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.priority((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1052");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory9);
    }

    @Test
    public void BasicThreadFactory1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1053");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
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
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1054");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void BasicThreadFactory1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1055");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
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
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
    }

    @Test
    public void BasicThreadFactory1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1056");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1057");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1058");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        long long5 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void BasicThreadFactory1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1059");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
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
    public void BasicThreadFactory1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1060");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        java.lang.Integer int8 = basicThreadFactory6.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler9 = basicThreadFactory6.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1061");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean5 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1062");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.Boolean boolean7 = basicThreadFactory5.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void BasicThreadFactory1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1063");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.daemon(true);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder4.build();
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
    public void BasicThreadFactory1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1064");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.lang.String str7 = basicThreadFactory6.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1065");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Integer int4 = basicThreadFactory3.getPriority();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1066");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder0.build();
        long long6 = basicThreadFactory5.getThreadCount();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1067");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.lang.Class<?> wildcardClass6 = builder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BasicThreadFactory1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1068");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory3.getWrappedFactory();
        java.lang.Class<?> wildcardClass9 = threadFactory8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1069");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) -1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("hi!");
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
    public void BasicThreadFactory1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1070");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
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
    public void BasicThreadFactory1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1071");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.priority(10);
        builder7.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void BasicThreadFactory1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1072");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(false);
        builder7.reset();
        java.lang.Class<?> wildcardClass9 = builder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1073");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority(0);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder7.namingPattern("");
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
    public void BasicThreadFactory1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1074");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long7 = basicThreadFactory3.getThreadCount();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void BasicThreadFactory1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1075");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        long long6 = basicThreadFactory3.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void BasicThreadFactory1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1076");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder5.build();
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
    }

    @Test
    public void BasicThreadFactory1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1077");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean7 = basicThreadFactory3.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BasicThreadFactory1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1078");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder4.namingPattern("hi!");
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
    public void BasicThreadFactory1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1079");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1080");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        builder4.reset();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        java.lang.Integer int9 = basicThreadFactory7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void BasicThreadFactory1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1081");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.namingPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void BasicThreadFactory1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1082");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.daemon(false);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder2.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void BasicThreadFactory1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1083");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory4 = builder2.build();
        java.lang.Boolean boolean5 = basicThreadFactory4.getDaemonFlag();
        java.lang.Boolean boolean6 = basicThreadFactory4.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory4.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory4.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1084");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory7.getUncaughtExceptionHandler();
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
    }

    @Test
    public void BasicThreadFactory1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1085");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory3.getWrappedFactory();
        long long7 = basicThreadFactory3.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1086");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.daemon(false);
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
    public void BasicThreadFactory1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1087");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Integer int8 = basicThreadFactory7.getPriority();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void BasicThreadFactory1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1088");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder3 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder3.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder3.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder2.wrappedFactory((java.util.concurrent.ThreadFactory) basicThreadFactory6);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder7.build();
        java.lang.Class<?> wildcardClass9 = basicThreadFactory8.getClass();
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
    public void BasicThreadFactory1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1089");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((-1));
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
    public void BasicThreadFactory1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1090");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.daemon(false);
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
    public void BasicThreadFactory1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1091");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) 'a');
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.daemon(true);
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
    public void BasicThreadFactory1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1092");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory9 = builder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
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
    public void BasicThreadFactory1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1093");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        long long6 = basicThreadFactory3.getThreadCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void BasicThreadFactory1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1094");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.String str5 = basicThreadFactory3.getNamingPattern();
        java.lang.Boolean boolean6 = basicThreadFactory3.getDaemonFlag();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory3.getUncaughtExceptionHandler();
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
        org.junit.Assert.assertNull(uncaughtExceptionHandler7);
    }

    @Test
    public void BasicThreadFactory1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1095");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder2.namingPattern("");
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
    public void BasicThreadFactory1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1096");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("hi!");
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
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
    }

    @Test
    public void BasicThreadFactory1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1097");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder8 = builder6.priority((int) 'a');
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
    public void BasicThreadFactory1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1098");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory6.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void BasicThreadFactory1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1099");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder0.build();
        java.lang.Boolean boolean7 = basicThreadFactory6.getDaemonFlag();
        java.lang.String str8 = basicThreadFactory6.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void BasicThreadFactory1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1100");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        java.lang.Boolean boolean4 = basicThreadFactory3.getDaemonFlag();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void BasicThreadFactory1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1101");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder2.build();
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
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
    public void BasicThreadFactory1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1102");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        builder4.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void BasicThreadFactory1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1103");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder0.build();
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = basicThreadFactory7.newThread(runnable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(thread9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[,5,main]");
    }

    @Test
    public void BasicThreadFactory1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1104");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) -1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder0.namingPattern("");
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
    public void BasicThreadFactory1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1105");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler7 = basicThreadFactory5.getUncaughtExceptionHandler();
        java.lang.Boolean boolean8 = basicThreadFactory5.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1106");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder2.build();
        java.lang.String str8 = basicThreadFactory7.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BasicThreadFactory1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1107");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        long long4 = basicThreadFactory3.getThreadCount();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.util.concurrent.ThreadFactory threadFactory7 = basicThreadFactory3.getWrappedFactory();
        java.lang.Boolean boolean8 = basicThreadFactory3.getDaemonFlag();
        java.lang.Boolean boolean9 = basicThreadFactory3.getDaemonFlag();
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
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1108");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        long long7 = basicThreadFactory5.getThreadCount();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler8 = basicThreadFactory5.getUncaughtExceptionHandler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
    }

    @Test
    public void BasicThreadFactory1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1109");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder4.daemon(true);
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
    public void BasicThreadFactory1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1110");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder0.priority((int) (byte) -1);
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
    public void BasicThreadFactory1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1111");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder2.priority((int) (short) 1);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder2.build();
        java.lang.Integer int6 = basicThreadFactory5.getPriority();
        java.lang.String str7 = basicThreadFactory5.getNamingPattern();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void BasicThreadFactory1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1112");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.priority((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BasicThreadFactory1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1113");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.Integer int6 = basicThreadFactory3.getPriority();
        java.lang.Integer int7 = basicThreadFactory3.getPriority();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler9);
    }

    @Test
    public void BasicThreadFactory1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1114");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.util.concurrent.ThreadFactory threadFactory4 = basicThreadFactory3.getWrappedFactory();
        java.lang.Integer int5 = basicThreadFactory3.getPriority();
        java.lang.String str6 = basicThreadFactory3.getNamingPattern();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void BasicThreadFactory1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1115");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        builder4.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory6 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        java.lang.Boolean boolean8 = basicThreadFactory7.getDaemonFlag();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void BasicThreadFactory1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1116");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.daemon(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void BasicThreadFactory1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1117");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.daemon(false);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder2.build();
        builder2.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder2.priority((int) ' ');
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder6.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1118");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.namingPattern("hi!");
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder5 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder7 = builder5.namingPattern("hi!");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory8 = builder5.build();
        builder5.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory8);
    }

    @Test
    public void BasicThreadFactory1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1119");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder6 = builder4.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory7 = builder4.build();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder9 = builder4.daemon(false);
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
    public void BasicThreadFactory1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1120");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        builder0.reset();
        builder0.reset();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder4 = builder0.namingPattern("");
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory5 = builder4.build();
        java.util.concurrent.ThreadFactory threadFactory6 = basicThreadFactory5.getWrappedFactory();
        long long7 = basicThreadFactory5.getThreadCount();
        java.util.concurrent.ThreadFactory threadFactory8 = basicThreadFactory5.getWrappedFactory();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory8);
    }

    @Test
    public void BasicThreadFactory1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BasicThreadFactory2.BasicThreadFactory1121");
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder();
        org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder builder2 = builder0.priority((int) (byte) 100);
        org.apache.commons.lang3.concurrent.BasicThreadFactory basicThreadFactory3 = builder0.build();
        java.lang.String str4 = basicThreadFactory3.getNamingPattern();
        java.util.concurrent.ThreadFactory threadFactory5 = basicThreadFactory3.getWrappedFactory();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = basicThreadFactory3.getUncaughtExceptionHandler();
        java.lang.String str7 = basicThreadFactory3.getNamingPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(basicThreadFactory3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(threadFactory5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uncaughtExceptionHandler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }
}
