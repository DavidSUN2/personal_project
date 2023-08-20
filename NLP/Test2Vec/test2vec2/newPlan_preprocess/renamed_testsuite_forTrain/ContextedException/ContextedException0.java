
package ContextedException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedException0 {

    public static boolean debug = false;

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test001");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test002");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test003");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test004");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test005");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test006");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test007");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test008");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test009");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test010");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Class<?> wildcardClass2 = strSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test011");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test012");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test013");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test014");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test015");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test016");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test017");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test018");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test019");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test020");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test021");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test022");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test023");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test024");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test025");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test026");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test027");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test028");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test029");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test030");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test031");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test032");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test033");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test034");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test035");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test036");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test037");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test038");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test039");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test040");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test041");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass5 = contextedException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test042");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass3 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test043");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test044");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test045");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test046");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test047");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test048");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test049");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test050");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test051");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test052");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str4 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test053");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test054");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test055");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test056");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test057");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test058");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test059");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test060");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test061");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test062");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test063");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test064");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test065");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test066");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test067");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test068");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass4 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test069");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test070");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test071");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test072");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test073");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test074");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test075");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test076");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test077");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test078");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test079");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test080");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test081");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test082");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test083");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test084");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test085");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test086");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test087");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test088");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test089");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test090");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test091");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test092");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test093");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test094");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test095");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test096");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test097");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test098");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test099");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test100");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test101");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test102");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test103");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test104");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass4 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test105");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test106");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test107");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test108");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test109");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test110");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test111");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test112");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj5 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test113");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test114");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test115");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test116");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test117");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test118");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test119");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test120");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test121");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test122");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test123");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test124");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test125");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test126");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        java.lang.Object obj5 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!");
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test127");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test128");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test129");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test130");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test131");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test132");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test133");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test134");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test135");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test136");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test137");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test138");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test139");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test140");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test141");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test142");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test143");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test144");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test145");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test146");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test147");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str3 = contextedException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test148");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str3 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test149");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test150");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test151");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test152");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test153");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = contextedException0.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test154");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test155");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test156");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test157");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test158");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test159");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test160");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test161");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test162");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test163");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test164");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test165");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test166");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test167");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test168");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test169");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.String str3 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test170");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test171");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test172");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test173");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test174");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test175");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test176");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test177");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test178");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test179");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test180");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test181");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test182");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test183");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test184");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test185");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test186");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test187");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test188");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test189");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test190");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test191");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test192");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test193");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test194");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test195");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str4 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test196");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test197");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test198");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test199");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test200");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test201");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test202");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test203");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test204");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str3 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test205");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test206");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test207");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test208");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.String str3 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test209");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test210");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test211");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test212");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test213");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test214");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test215");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test216");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test217");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test218");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test219");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test220");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test221");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test222");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test223");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test224");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test225");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test226");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test227");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test228");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test229");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test230");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test231");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test232");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass2 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test233");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test234");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test235");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test236");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test237");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test238");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test239");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test240");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test241");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test242");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test243");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test244");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test245");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test246");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray7 = contextedException6.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test247");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test248");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test249");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test250");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            contextedException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test251");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test252");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test253");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test254");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test255");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test256");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str5 = contextedException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test257");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test258");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test259");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test260");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test261");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test262");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test263");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test264");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test265");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test266");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test267");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test268");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test269");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Object) 100L);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test270");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test271");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test272");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test273");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test274");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test275");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test276");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test277");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test278");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test279");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test280");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test281");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test282");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test283");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test284");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test285");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test286");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test287");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test288");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Class<?> wildcardClass2 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test289");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test290");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test291");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test292");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test293");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test294");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Class<?> wildcardClass2 = contextedException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test295");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test296");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test297");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test298");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test299");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.lang.Class<?> wildcardClass3 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test300");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test301");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test302");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test303");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test304");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test305");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test306");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test307");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test308");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test309");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test310");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Throwable[] throwableArray3 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test311");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test312");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test313");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test314");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test315");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test316");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test317");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test318");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test319");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test320");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test321");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test322");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test323");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test324");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test325");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test326");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test327");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.Set<java.lang.String> strSet3 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test328");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test329");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test330");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test331");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test332");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test333");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test334");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test335");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test336");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test337");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test338");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test339");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test340");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test341");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test342");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str2 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test343");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.util.List<java.lang.Object> objList7 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test344");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test345");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test346");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test347");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test348");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test349");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test350");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test351");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test352");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test353");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test354");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test355");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test356");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test357");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test358");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test359");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test360");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test361");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test362");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test363");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test364");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test365");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test366");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test367");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test368");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test369");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test370");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test371");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.Class<?> wildcardClass3 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test372");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test373");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test374");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test375");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test376");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        java.util.List<java.lang.Object> objList5 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test377");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test378");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test379");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test380");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test381");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test382");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test383");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.String str5 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test384");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test385");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test386");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test387");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test388");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test389");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test390");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test391");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test392");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test393");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test394");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test395");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test396");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test397");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test398");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test399");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test400");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4, exceptionContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test401");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test402");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test403");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test404");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.setContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test405");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test406");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test407");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test408");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test409");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test410");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test411");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test412");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test413");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test414");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test415");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test416");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test417");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test418");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test419");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test420");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test421");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test422");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test423");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test424");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test425");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test426");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test427");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test428");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test429");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test430");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test431");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", throwable1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test432");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test433");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test434");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test435");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test436");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test437");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test438");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test439");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test440");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test441");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test442");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test443");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test444");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test445");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test446");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test447");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test448");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test449");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test450");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test451");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test452");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test453");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test454");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test455");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test456");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test457");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str7 = contextedException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test458");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test459");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test460");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test461");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test462");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test463");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test464");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test465");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test466");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test467");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test468");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test469");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test470");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test471");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test472");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test473");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test474");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test475");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.String str3 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test476");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test477");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test478");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test479");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test480");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test481");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test482");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test483");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test484");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException(throwable0);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test485");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test486");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test487");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test488");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test489");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test490");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test491");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test492");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test493");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test494");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test495");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test496");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test497");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test498");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test499");
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException0.test500");
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

