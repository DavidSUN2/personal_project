package ContextedException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedException0 {

    public static boolean debug = false;

    @Test
    public void ContextedException001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException001");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.addContextValue("", obj7);
        java.lang.String str9 = contextedException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException002");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = contextedException1.getFirstContextValue("");
        java.lang.Object obj9 = contextedException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException003");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.addContextValue("", obj7);
        java.lang.String str9 = contextedException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ContextedException004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException004");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.String str6 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException005");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException006");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        contextedException4.addSuppressed((java.lang.Throwable) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException007");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Class<?> wildcardClass6 = contextedException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException008");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException009");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.String str9 = contextedException2.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedException010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException010");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Class<?> wildcardClass2 = strSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException011");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.lang.String str5 = contextedException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException012");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        java.lang.Class<?> wildcardClass7 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException013");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.addContextValue("", obj7);
        java.lang.String str9 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ContextedException014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException014");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.String str9 = contextedException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException015");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedException016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException016");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.setContextValue("", (java.lang.Object) contextedException5);
        java.lang.Throwable[] throwableArray9 = contextedException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException017");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Class<?> wildcardClass4 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException018");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException019");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException4, (org.apache.commons.lang3.exception.ExceptionContext) contextedException7);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException1.addContextValue("", (java.lang.Object) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException020");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.lang.Throwable[] throwableArray7 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException021");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str6 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void ContextedException022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException022");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.setContextValue("", (java.lang.Object) contextedException5);
        java.util.Set<java.lang.String> strSet9 = contextedException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException023");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException024");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.addContextValue("", obj7);
        java.lang.Throwable[] throwableArray9 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException025");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.Throwable[] throwableArray9 = contextedException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException026");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException027");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.lang.String str7 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void ContextedException028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException028");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.lang.Class<?> wildcardClass7 = objList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException029");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        java.lang.Object obj9 = contextedException1.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException030");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException031");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass6 = contextedException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException032");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.lang.String str9 = contextedException7.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException033");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException4);
        java.lang.Class<?> wildcardClass8 = contextedException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException034");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.addContextValue("", (java.lang.Object) contextedException7);
        java.lang.Class<?> wildcardClass9 = contextedException8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException035");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException0.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException036");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException2);
    }

    @Test
    public void ContextedException037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException037");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.lang.String str9 = contextedException2.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException038");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.String str9 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException039");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Class<?> wildcardClass6 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException040");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in ContextedException generation
        try {
            contextedException7.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedException041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException041");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass5 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ContextedException042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException042");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass3 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException043");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.lang.Object obj9 = contextedException7.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException044");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException6.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException045");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.String str6 = contextedException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException046");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException047");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj7);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
    }

    @Test
    public void ContextedException048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException048");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.String str4 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException049");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.addContextValue("", (java.lang.Object) contextedException7);
        java.lang.String str9 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedException050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException050");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException8.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException051");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.setContextValue("", (java.lang.Object) contextedException5);
        java.lang.String str9 = contextedException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException052");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str4 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException053");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException054");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass6 = contextedException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException055");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException056");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException057");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ContextedException058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException058");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.addContextValue("", obj7);
        java.util.Set<java.lang.String> strSet9 = contextedException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException059");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<java.lang.Object> objList7 = contextedException5.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedException5.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException060");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException2.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException061");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.String str9 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException062");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException063");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException064");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<java.lang.Object> objList7 = contextedException5.getContextValues("");
        java.lang.String str8 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException065");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.lang.String str7 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ContextedException066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException066");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.lang.Class<?> wildcardClass3 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException067");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        java.util.List<java.lang.Object> objList8 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass9 = objList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException068");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass4 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException069");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException4);
        java.lang.String str9 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException070");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void ContextedException071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException071");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.String str5 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException072");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        java.lang.String str7 = contextedException2.getFormattedExceptionMessage("");
        java.lang.Throwable[] throwableArray8 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException073");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.setContextValue("", (java.lang.Object) contextedException5);
        java.util.Set<java.lang.String> strSet9 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException074");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.lang.Throwable[] throwableArray7 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.String str9 = contextedException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException075");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.String str8 = contextedException7.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException076");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.String str4 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException077");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException078");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("");
        java.lang.Throwable[] throwableArray7 = contextedException1.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException079");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        java.lang.Class<?> wildcardClass9 = contextedException8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException080");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Object obj8 = contextedException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void ContextedException081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException081");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.util.Set<java.lang.String> strSet8 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException082");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.util.List<java.lang.Object> objList9 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException083");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.lang.Throwable[] throwableArray7 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.String str9 = contextedException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException084");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.String str7 = contextedException5.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ContextedException085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException085");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.addContextValue("", (java.lang.Object) contextedException7);
        java.lang.Class<?> wildcardClass9 = contextedException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException086");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException7.getContextEntries();
        contextedException5.addSuppressed((java.lang.Throwable) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException087");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException088");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException2);
        java.lang.String str6 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException089");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.lang.String str5 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException090");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str8 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException091");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass7 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException092");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<java.lang.Object> objList7 = contextedException5.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedException5.getSuppressed();
        java.lang.String str9 = contextedException5.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedException093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException093");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj8 = contextedException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException094");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass7 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException095");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.String str6 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ContextedException096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException096");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = contextedException1.getFirstContextValue("");
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException097");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.addContextValue("", obj7);
        java.lang.Class<?> wildcardClass9 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException098");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException099");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException2.getSuppressed();
        java.lang.String str5 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException100");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException0.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedException0.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException101");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.addContextValue("", (java.lang.Object) contextedException7);
        java.util.Set<java.lang.String> strSet9 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException102");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray8 = contextedException7.getSuppressed();
        java.util.Set<java.lang.String> strSet9 = contextedException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException103");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Object obj9 = contextedException7.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException104");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass4 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException105");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2, exceptionContext7);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException106");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        java.util.Set<java.lang.String> strSet9 = contextedException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException107");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.String str8 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException108");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException109");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str5 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException110");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = objList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException111");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.String str8 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException112");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj5 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedException113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException113");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException114");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList9 = contextedException2.getContextValues("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException115");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException116");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.String str8 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException117");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.lang.Class<?> wildcardClass8 = strPairList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException118");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException119");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.String str8 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException120");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "hi!");
        java.lang.String str7 = contextedException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedException121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException121");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Class<?> wildcardClass6 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException122");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) 100L);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException6.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException123");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.addContextValue("", (java.lang.Object) contextedException7);
        java.lang.String str9 = contextedException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedException124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException124");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.lang.Object obj9 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException125");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException126");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Object obj5 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!");
        // The following exception was thrown during execution in ContextedException generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedException127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException127");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedException4.getContextLabels();
        java.lang.Class<?> wildcardClass8 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException128");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
    }

    @Test
    public void ContextedException129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException129");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.util.List<java.lang.Object> objList6 = contextedException0.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Object obj8 = contextedException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException130");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.util.List<java.lang.Object> objList8 = contextedException5.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException131");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass4 = strPairList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException132");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedException1.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException133");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass8 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException134");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.String str4 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException135");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException136");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException2.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj7);
        java.lang.String str9 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException137");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        java.lang.Object obj8 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException138");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray6 = contextedException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedException2.getSuppressed();
        java.lang.String str9 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException139");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException140");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
    }

    @Test
    public void ContextedException141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException141");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<java.lang.Object> objList7 = contextedException5.getContextValues("");
        java.lang.Object obj9 = contextedException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException142");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Class<?> wildcardClass8 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException143");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException6.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedException6.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException144");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        java.lang.String str7 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException145");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException146");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj6 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException147");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // The following exception was thrown during execution in ContextedException generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedException148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException148");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str3 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException149");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray6 = contextedException2.getSuppressed();
        java.lang.String str8 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException150");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException3.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = contextedException3.getContextLabels();
        java.lang.String str7 = contextedException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException151");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str6 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException152");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException153");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = contextedException0.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedException154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException154");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in ContextedException generation
        try {
            contextedException2.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException155");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.lang.String str9 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException156");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.lang.String str8 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException157");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException158");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException159");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException6);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedException160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException160");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException2.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj7);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException161");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        java.util.List<java.lang.Object> objList8 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.String str9 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedException162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException162");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException163");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj7 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedException164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException164");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str7 = contextedException4.getFormattedExceptionMessage("hi!");
        java.util.List<java.lang.Object> objList9 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException165");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet8 = contextedException7.getContextLabels();
        java.lang.Throwable[] throwableArray9 = contextedException7.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException166");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedException1.getContextLabels();
        java.lang.String str8 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException167");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException168");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getRawMessage();
        java.lang.Class<?> wildcardClass6 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException169");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.String str3 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException170");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.lang.String str9 = contextedException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException171");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet8 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException172");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException173");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.lang.String str8 = contextedException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException174");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException175");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException176");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!");
        java.lang.String str9 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException177");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedException178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException178");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        java.lang.Class<?> wildcardClass9 = contextedException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException179");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException180");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedException4.getContextLabels();
        java.util.Set<java.lang.String> strSet8 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException181");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.lang.Throwable[] throwableArray7 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException182");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) 0);
        java.lang.String str7 = contextedException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------"));
    }

    @Test
    public void ContextedException183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException183");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.lang.Throwable[] throwableArray8 = contextedException7.getSuppressed();
        java.lang.String str9 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException184");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedException1.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException185");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException2.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj7);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException186");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void ContextedException187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException187");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.setContextValue("", (java.lang.Object) contextedException5);
        java.lang.Throwable[] throwableArray9 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException188");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException189");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.String str3 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray4 = contextedException0.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void ContextedException190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException190");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet7 = contextedException2.getContextLabels();
        java.lang.Object obj9 = contextedException2.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException191");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("");
        java.lang.String str8 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException192");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.Class<?> wildcardClass8 = strSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException193");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException0.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedException0.getRawMessage();
        java.lang.Class<?> wildcardClass7 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException194");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedException195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException195");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str4 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException196");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException197");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException198");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = contextedException0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void ContextedException199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException199");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = contextedException2.getContextLabels();
        java.lang.Class<?> wildcardClass6 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException200");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.String str5 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException201");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException202");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException203");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str6 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException204");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str3 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException205");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.lang.String str6 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException206");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray9 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException207");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException5.getContextLabels();
        java.util.List<java.lang.Object> objList8 = contextedException5.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException208");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.String str3 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ContextedException209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException209");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass7 = objList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException210");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException211");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
    }

    @Test
    public void ContextedException212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException212");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray6 = contextedException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedException2.getSuppressed();
        java.lang.String str9 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException213");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException6.getContextEntries();
        java.lang.String str8 = contextedException6.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ContextedException214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException214");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) 100L);
        java.lang.String str7 = contextedException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException215");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Object obj5 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        java.lang.Object obj7 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedException216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException216");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException217");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) 0L);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
    }

    @Test
    public void ContextedException218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException218");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str8 = contextedException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException219");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray9 = contextedException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException220");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Object obj5 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!");
        java.lang.String str7 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet8 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException221");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.lang.Object obj8 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException222");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ContextedException223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException223");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
    }

    @Test
    public void ContextedException224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException224");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) 0L);
        java.util.Set<java.lang.String> strSet8 = contextedException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException225");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        java.lang.Object obj6 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedException226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException226");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray7 = contextedException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedException6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException227");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedException1.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException228");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.lang.String str7 = contextedException3.getRawMessage();
        java.lang.String str8 = contextedException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void ContextedException229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException229");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str7 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedException230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException230");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str8 = contextedException7.getRawMessage();
        java.lang.Class<?> wildcardClass9 = contextedException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException231");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void ContextedException232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException232");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass2 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException233");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException4.getRawMessage();
        java.lang.Class<?> wildcardClass6 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException234");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str5 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException235");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.lang.Throwable throwable4 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable4);
        java.lang.String str7 = contextedException5.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException236");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException237");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass9 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException238");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.String str6 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException239");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedException240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException240");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedException3.getSuppressed();
        java.lang.String str8 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException241");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray7 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException242");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Object obj8 = contextedException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException243");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Object obj8 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException244");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException8.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException245");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.String str9 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException246");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray7 = contextedException6.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException247");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.lang.String str8 = contextedException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------"));
    }

    @Test
    public void ContextedException248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException248");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException249");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        java.lang.String str6 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException250");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in ContextedException generation
        try {
            contextedException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ContextedException251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException251");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException252");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException2.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        java.lang.Throwable[] throwableArray7 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException253");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.Object obj7 = contextedException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str8 = contextedException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException254");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2, exceptionContext7);
        java.lang.String str9 = contextedException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException255");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException256");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in ContextedException generation
        try {
            contextedException4.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException257");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException258");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str7 = contextedException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException259");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException2.getContextEntries();
        java.lang.Class<?> wildcardClass6 = strPairList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException260");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException261");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException262");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
    }

    @Test
    public void ContextedException263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException263");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedException5.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray8 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException264");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.Object obj7 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedException265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException265");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.lang.Object obj8 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException266");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedException6.getRawMessage();
        java.lang.String str9 = contextedException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------"));
    }

    @Test
    public void ContextedException267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException267");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray6 = contextedException5.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException5.getContextEntries();
        java.lang.Throwable[] throwableArray8 = contextedException5.getSuppressed();
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException268");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        java.lang.String str6 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException269");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) 100L);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException270");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.String str7 = contextedException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException271");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.String str6 = contextedException5.getRawMessage();
        java.lang.Object obj8 = contextedException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException272");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) 0L);
        java.lang.String str8 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ContextedException273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException273");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException274");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException3.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException275");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray9 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException276");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        java.lang.String str7 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException277");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str5 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException278");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException3.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = contextedException3.getContextLabels();
        java.lang.String str7 = contextedException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException279");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void ContextedException280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException280");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException281");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = contextedException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException282");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.util.Set<java.lang.String> strSet9 = contextedException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException283");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.util.List<java.lang.Object> objList7 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException284");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException285");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str9 = contextedException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException286");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException287");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException2.getContextEntries();
        java.lang.Throwable[] throwableArray5 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException288");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Class<?> wildcardClass2 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException289");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.lang.String str8 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException290");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.lang.String str3 = contextedException2.getRawMessage();
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException291");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet5 = contextedException4.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException292");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.String str7 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------"));
    }

    @Test
    public void ContextedException293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException293");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.lang.String str8 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException294");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Class<?> wildcardClass2 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException295");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException4.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = contextedException4.getContextLabels();
        java.util.Set<java.lang.String> strSet9 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException296");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        java.util.Set<java.lang.String> strSet9 = contextedException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException297");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.lang.String str8 = contextedException1.getFormattedExceptionMessage("");
        java.lang.String str9 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException298");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException7.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException299");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.lang.Class<?> wildcardClass3 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException300");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException1.setContextValue("", (java.lang.Object) contextedException5);
        java.lang.String str9 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException301");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.String str3 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException302");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        java.lang.Object obj8 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException303");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedException304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException304");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException305");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = contextedException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException306");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet8 = contextedException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException307");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException308");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException309");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedException310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException310");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedException311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException311");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.addContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str9 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedException312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException312");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException313");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        java.lang.Object obj8 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException314");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str4 = contextedException1.getRawMessage();
        java.lang.Object obj6 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedException315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException315");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException316");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedException3.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException317");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedException318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException318");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
    }

    @Test
    public void ContextedException319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException319");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void ContextedException320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException320");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException321");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
    }

    @Test
    public void ContextedException322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException322");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException323");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) 0);
        java.lang.String str8 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------"));
    }

    @Test
    public void ContextedException324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException324");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
    }

    @Test
    public void ContextedException325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException325");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.lang.String str8 = contextedException3.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException326");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException327");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedException328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException328");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedException3.getRawMessage();
        java.lang.Object obj8 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException329");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.String str7 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str9 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException330");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException331");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.String str3 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str5 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj7 = contextedException0.getFirstContextValue("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException332");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.lang.Throwable[] throwableArray8 = contextedException7.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException333");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedException1.getRawMessage();
        java.lang.Object obj9 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException334");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException335");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray8 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException336");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.util.List<java.lang.Object> objList8 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException337");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Throwable[] throwableArray6 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException338");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.lang.Throwable[] throwableArray7 = contextedException3.getSuppressed();
        java.lang.String str8 = contextedException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void ContextedException339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException339");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) 100L);
        java.lang.Object obj8 = contextedException6.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str9 = contextedException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException340");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
    }

    @Test
    public void ContextedException341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException341");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.addContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException2);
        java.lang.Object obj8 = contextedException6.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException342");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException343");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.List<java.lang.Object> objList7 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException344");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException6);
        java.lang.String str8 = contextedException7.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException345");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException4.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException4.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException346");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
    }

    @Test
    public void ContextedException347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException347");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.lang.String str8 = contextedException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException348");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException3.getRawMessage();
        java.util.Set<java.lang.String> strSet5 = contextedException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void ContextedException349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException349");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str8 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException350");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException351");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str6 = contextedException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.Set<java.lang.String> strSet8 = contextedException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException352");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException353");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("hi!");
        java.lang.Throwable[] throwableArray5 = contextedException1.getSuppressed();
        java.lang.Class<?> wildcardClass6 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException354");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedException355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException355");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
    }

    @Test
    public void ContextedException356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException356");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedException1.getContextLabels();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException357");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        java.lang.Class<?> wildcardClass6 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException358");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj7);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
    }

    @Test
    public void ContextedException359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException359");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException360");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str4 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedException361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException361");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass8 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException362");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException363");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str7 = contextedException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedException364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException364");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray8 = contextedException7.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException365");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException366");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray5 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedException367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException367");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedException368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException368");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet7 = contextedException6.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException6);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4, (org.apache.commons.lang3.exception.ExceptionContext) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException369");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.Class<?> wildcardClass8 = contextedException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException370");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException371");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.Class<?> wildcardClass3 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException372");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException4.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = contextedException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException373");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet7 = contextedException6.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException374");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
    }

    @Test
    public void ContextedException375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException375");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str6 = contextedException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException7.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException376");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedException377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException377");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        java.lang.Object obj5 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList8 = contextedException6.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException378");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
    }

    @Test
    public void ContextedException379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException379");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException380");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.Class<?> wildcardClass6 = strPairList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException381");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str9 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException382");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.String str3 = contextedException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException383");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException384");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException385");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.lang.Class<?> wildcardClass7 = strPairList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException386");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedException1.getSuppressed();
        java.lang.String str7 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ContextedException387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException387");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException();
        contextedException3.addSuppressed((java.lang.Throwable) contextedException7);
        java.lang.Class<?> wildcardClass9 = contextedException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException388");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        java.lang.Throwable[] throwableArray9 = contextedException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException389");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException390");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj5);
        java.lang.String str8 = contextedException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException391");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str7 = contextedException4.getFormattedExceptionMessage("hi!");
        java.lang.Class<?> wildcardClass8 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException392");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException1.getContextEntries();
        java.lang.String str9 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException393");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException394");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException7);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException395");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray8 = contextedException2.getSuppressed();
        java.lang.Class<?> wildcardClass9 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException396");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) 100L);
        java.lang.Throwable[] throwableArray7 = contextedException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException397");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException398");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str4 = contextedException3.getRawMessage();
        java.lang.String str5 = contextedException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        java.util.Set<java.lang.String> strSet7 = contextedException6.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException6);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException399");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException5);
        java.lang.String str7 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException400");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4, exceptionContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void ContextedException401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException401");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.String str7 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException402");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException403");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        contextedException0.addSuppressed((java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedException404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException404");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException405");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException406");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException407");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray6 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException408");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException0.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
    }

    @Test
    public void ContextedException409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException409");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
    }

    @Test
    public void ContextedException410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException410");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList8 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException411");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException412");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException2.getSuppressed();
        java.lang.String str5 = contextedException2.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        java.lang.Object obj8 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException413");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.Set<java.lang.String> strSet4 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedException414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException414");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException415");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray7 = contextedException4.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException4.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException416");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj8 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException2.setContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException417");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray7 = contextedException1.getSuppressed();
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException418");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray6 = contextedException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedException2.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException419");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException1.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
    }

    @Test
    public void ContextedException420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException420");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext8 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5, exceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException421");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException422");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException423");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj8 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass9 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException424");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException3.getContextEntries();
        java.lang.String str9 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException425");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException426");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException427");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.util.List<java.lang.Object> objList8 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException428");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException429");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in ContextedException generation
        try {
            contextedException0.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException430");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        java.lang.String str6 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str8 = contextedException7.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException431");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedException432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException432");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.String str7 = contextedException6.getRawMessage();
        java.lang.String str8 = contextedException6.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedException6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedException433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException433");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException3.setContextValue("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", obj7);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException434");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException435");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        java.lang.Object obj8 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException436");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException437");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException5.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException438");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.lang.String str7 = contextedException5.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedException5.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException439");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedException1.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException440");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str7 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException441");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedException1.getSuppressed();
        java.lang.String str7 = contextedException1.getRawMessage();
        java.lang.Object obj9 = contextedException1.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException442");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException443");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList7 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException444");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str8 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException445");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException6.getContextEntries();
        java.lang.String str8 = contextedException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException446");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.lang.String str8 = contextedException5.getFormattedExceptionMessage("hi!");
        java.lang.Throwable[] throwableArray9 = contextedException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException447");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
    }

    @Test
    public void ContextedException448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException448");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("hi!");
        java.lang.String str5 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException449");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedException450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException450");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException451");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException452");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str6 = contextedException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.Object obj9 = contextedException7.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException453");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException454");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.Object obj7 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.Object obj9 = contextedException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException455");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray7 = contextedException4.getSuppressed();
        java.lang.String str8 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ContextedException456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException456");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", obj6);
        java.lang.String str8 = contextedException2.getRawMessage();
        java.util.Set<java.lang.String> strSet9 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException457");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str7 = contextedException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException458");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str4 = contextedException1.getRawMessage();
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException459");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException460");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList9 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException461");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException462");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.Set<java.lang.String> strSet5 = contextedException3.getContextLabels();
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException463");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.lang.String str6 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        java.util.List<java.lang.Object> objList8 = contextedException0.getContextValues("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException464");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void ContextedException465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException465");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in ContextedException generation
        try {
            contextedException1.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
    }

    @Test
    public void ContextedException466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException466");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.String str8 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ContextedException467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException467");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<java.lang.Object> objList6 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj8 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException468");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedException1.getSuppressed();
        java.lang.String str7 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray9 = contextedException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException469");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet7 = contextedException2.getContextLabels();
        java.lang.String str8 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException470");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.lang.Object obj7 = contextedException1.getFirstContextValue("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.String str8 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException471");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet7 = contextedException6.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException472");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.lang.Object obj7 = contextedException1.getFirstContextValue("hi!");
        java.lang.Throwable[] throwableArray8 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException473");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException2.getSuppressed();
        java.util.Set<java.lang.String> strSet5 = contextedException2.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException474");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedException1.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedException475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException475");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.String str3 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException476");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.String str3 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str5 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.lang.Object obj8 = contextedException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException477");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.util.Set<java.lang.String> strSet8 = contextedException1.getContextLabels();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException478");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2, exceptionContext7);
        java.lang.String str9 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ContextedException479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException479");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException480");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.util.Set<java.lang.String> strSet2 = contextedException0.getContextLabels();
        java.lang.Class<?> wildcardClass3 = strSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException481");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedException3.getRawMessage();
        java.util.Set<java.lang.String> strSet7 = contextedException3.getContextLabels();
        java.util.List<java.lang.Object> objList9 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException482");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<java.lang.Object> objList8 = contextedException5.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException1.setContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException483");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.String str7 = contextedException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException484");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
    }

    @Test
    public void ContextedException485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException485");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        java.lang.String str4 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ContextedException486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException486");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void ContextedException487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException487");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        java.lang.Object obj7 = contextedException5.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray8 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException488");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        java.lang.Object obj5 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedException489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException489");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray8 = contextedException7.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException490");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException491");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        java.lang.String str9 = contextedException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException492");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        java.util.Set<java.lang.String> strSet7 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException5);
        java.util.Set<java.lang.String> strSet9 = contextedException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException493");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.String str9 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException494");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "hi!");
        java.util.List<java.lang.Object> objList8 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
        java.lang.String str9 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedException495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException495");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedException2.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException2.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str7 = contextedException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException496");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException5.getContextEntries();
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException497");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException6.getContextEntries();
        java.lang.String str9 = contextedException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException498");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException499");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet8 = contextedException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.ContextedException500");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList6 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }
}

