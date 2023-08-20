package ContextedException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedException0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test01");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str3 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test02");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException4.addContextValue("", (java.lang.Object) '#');
        java.lang.Object obj9 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test03");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.setContextValue("hi!", (java.lang.Object) 100);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test04");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test05");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test06");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test07");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.lang.Class<?> wildcardClass5 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test08");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.lang.String str5 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test09");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test10");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str6 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test11");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test12");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException3);
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test13");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str7 = contextedException1.getRawMessage();
        java.lang.Object obj9 = contextedException1.getFirstContextValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test14");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", obj4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.String str7 = contextedException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test15");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        java.util.List<java.lang.Object> objList8 = contextedException4.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test16");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("hi!", (java.lang.Object) 100);
        java.lang.Object obj7 = contextedException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test17");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str3 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test18");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        java.lang.Class<?> wildcardClass7 = strPairList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test19");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test20");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray7 = contextedException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedException6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test21");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException2.getRawMessage();
        java.lang.Object obj5 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test22");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray7 = contextedException6.getSuppressed();
        java.lang.Object obj9 = contextedException6.getFirstContextValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test23");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!", throwable1);
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test24");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            contextedException2.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test25");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException4.addContextValue("", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test26");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test27");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException4.setContextValue("hi!", obj6);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test28");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.lang.Throwable[] throwableArray1 = contextedException0.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test29");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("", (java.lang.Object) (short) 100);
        java.lang.Throwable[] throwableArray6 = contextedException5.getSuppressed();
        java.util.List<java.lang.Object> objList8 = contextedException5.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test30");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", obj4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test31");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray6 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test32");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        java.util.Set<java.lang.String> strSet5 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test33");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.lang.String str6 = contextedException2.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test34");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test35");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: ");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test36");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.String str6 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test37");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.String str7 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test38");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("hi!");
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test39");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.util.List<java.lang.Object> objList6 = contextedException1.getContextValues("");
        java.lang.Class<?> wildcardClass7 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test40");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test41");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("hi!", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test42");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException3);
        java.lang.String str7 = contextedException5.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test43");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException2.getRawMessage();
        java.lang.Object obj5 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException6, (org.apache.commons.lang3.exception.ExceptionContext) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test44");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test45");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test46");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", obj4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test47");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException2.setContextValue("", (java.lang.Object) (short) 100);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test48");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException3);
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test49");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test50");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test51");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test52");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("hi!");
        java.lang.Object obj6 = contextedException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test53");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test54");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("hi!");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test55");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.String str9 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:hi!=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:hi!=null]\n---------------------------------"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test56");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test57");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", obj3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException4.addContextValue("", (java.lang.Object) '#');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException7.getContextEntries();
        java.util.Set<java.lang.String> strSet9 = contextedException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test58");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("hi!", (java.lang.Object) 0L);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }
}

