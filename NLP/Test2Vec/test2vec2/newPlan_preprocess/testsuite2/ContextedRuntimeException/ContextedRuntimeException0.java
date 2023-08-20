package ContextedRuntimeException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedRuntimeException0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test01");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str3 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test02");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException4.addContextValue("", (java.lang.Object) '#');
        java.lang.Object obj9 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test03");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.setContextValue("hi!", (java.lang.Object) 100);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test04");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test05");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException4.addContextValue("", (java.lang.Object) '#');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException7.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test06");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test07");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test08");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.lang.Class<?> wildcardClass5 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test09");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test10");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test11");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str6 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test12");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test13");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException3);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test14");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj9 = contextedRuntimeException1.getFirstContextValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test15");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", obj4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str7 = contextedRuntimeException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test16");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException4.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test17");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 100);
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test18");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str3 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test19");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        java.lang.Class<?> wildcardClass7 = strPairList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test20");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test21");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test22");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        java.lang.Object obj5 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test23");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException6.getSuppressed();
        java.lang.Object obj9 = contextedRuntimeException6.getFirstContextValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test24");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", throwable1);
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test25");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test26");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            contextedRuntimeException2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test27");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException4.addContextValue("", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test28");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test29");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException4.setContextValue("hi!", obj6);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test30");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.lang.Throwable[] throwableArray1 = contextedRuntimeException0.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test31");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("", (java.lang.Object) (short) 100);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException5.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test32");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", obj4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test33");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test34");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test35");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str6 = contextedRuntimeException2.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test36");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test37");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test38");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test39");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.String str7 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test40");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("hi!");
        java.lang.String str5 = contextedRuntimeException1.getFormattedExceptionMessage("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test41");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException1.getContextValues("");
        java.lang.Class<?> wildcardClass7 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test42");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test43");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test44");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException3);
        java.lang.String str7 = contextedRuntimeException5.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test45");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        java.lang.Object obj5 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException6, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test46");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test47");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test48");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", obj4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test49");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException2.setContextValue("", (java.lang.Object) (short) 100);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test50");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test51");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        java.lang.String str5 = contextedRuntimeException2.getFormattedExceptionMessage("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test52");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test53");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test54");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("hi!");
        java.lang.Object obj6 = contextedRuntimeException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test55");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException(throwable0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test56");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.test57");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str9 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:hi!=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:hi!=null]\n---------------------------------"));
    }
}

