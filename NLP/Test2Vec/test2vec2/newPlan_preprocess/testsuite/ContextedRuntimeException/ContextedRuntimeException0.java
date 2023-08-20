package ContextedRuntimeException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedRuntimeException0 {

    public static boolean debug = false;

    @Test
    public void ContextedRuntimeException001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException001");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.addContextValue("", obj7);
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException002");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("");
        java.lang.Object obj9 = contextedRuntimeException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException003");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.addContextValue("", obj7);
        java.lang.String str9 = contextedRuntimeException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException004");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.String str6 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException005");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException006");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        contextedRuntimeException4.addSuppressed((java.lang.Throwable) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedRuntimeException007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException007");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException008");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException009");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str9 = contextedRuntimeException2.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedRuntimeException010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException010");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Class<?> wildcardClass2 = strSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedRuntimeException011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException011");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.lang.String str5 = contextedRuntimeException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException012");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.lang.Class<?> wildcardClass7 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException013");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.addContextValue("", obj7);
        java.lang.String str9 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException014");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException015");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedRuntimeException016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException016");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.setContextValue("", (java.lang.Object) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException017");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException018");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException019");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException4, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException7);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException1.addContextValue("", (java.lang.Object) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException020");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException021");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void ContextedRuntimeException022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException022");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.setContextValue("", (java.lang.Object) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException023");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException024");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.addContextValue("", obj7);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException025");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException026");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException027");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.lang.String str7 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void ContextedRuntimeException028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException028");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.lang.Class<?> wildcardClass7 = objList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException029");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj9 = contextedRuntimeException1.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
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
    public void ContextedRuntimeException030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException030");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException031");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException032");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.lang.String str9 = contextedRuntimeException7.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException033");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException034");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.addContextValue("", (java.lang.Object) contextedRuntimeException7);
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException035");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException0.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException036");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
    }

    @Test
    public void ContextedRuntimeException037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException037");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.lang.String str9 = contextedRuntimeException2.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException038");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.String str9 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException039");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException040");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException7.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedRuntimeException041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException041");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass5 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ContextedRuntimeException042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException042");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass3 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedRuntimeException043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException043");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.lang.Object obj9 = contextedRuntimeException7.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException044");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException6.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException045");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.lang.String str6 = contextedRuntimeException0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException046");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException047");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj7);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
    }

    @Test
    public void ContextedRuntimeException048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException048");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.String str4 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException049");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.addContextValue("", (java.lang.Object) contextedRuntimeException7);
        java.lang.String str9 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedRuntimeException050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException050");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException8.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException051");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.setContextValue("", (java.lang.Object) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException052");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException053");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException054");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException055");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
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
    public void ContextedRuntimeException056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException056");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException057");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ContextedRuntimeException058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException058");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.addContextValue("", obj7);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException059");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException5.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException5.getSuppressed();
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
    public void ContextedRuntimeException060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException060");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException2.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException061");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.String str9 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException062");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException063");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException064");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException5.getContextValues("");
        java.lang.String str8 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException065");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException066");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.lang.Class<?> wildcardClass3 = contextedRuntimeException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedRuntimeException067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException067");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
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
    public void ContextedRuntimeException068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException068");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException069");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str9 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException070");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void ContextedRuntimeException071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException071");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.String str5 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException072");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        java.lang.String str7 = contextedRuntimeException2.getFormattedExceptionMessage("");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException073");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.setContextValue("", (java.lang.Object) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException074");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException075");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.String str8 = contextedRuntimeException7.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException076");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.String str4 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException077");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException078");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("");
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException1.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException079");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException080");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Object obj8 = contextedRuntimeException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void ContextedRuntimeException081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException081");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException082");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException083");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException084");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str7 = contextedRuntimeException5.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException085");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.addContextValue("", (java.lang.Object) contextedRuntimeException7);
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException086");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException7.getContextEntries();
        contextedRuntimeException5.addSuppressed((java.lang.Throwable) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException087");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException088");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str6 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException089");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.lang.String str5 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException090");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str8 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException091");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass7 = contextedRuntimeException4.getClass();
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
    public void ContextedRuntimeException092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException092");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException5.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException5.getSuppressed();
        java.lang.String str9 = contextedRuntimeException5.getRawMessage();
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
    public void ContextedRuntimeException093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException093");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj8 = contextedRuntimeException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException094");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass7 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException095");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.String str6 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ContextedRuntimeException096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException096");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("");
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException097");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.addContextValue("", obj7);
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException098");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException099");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException2.getSuppressed();
        java.lang.String str5 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException100");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException0.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException0.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedRuntimeException101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException101");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.addContextValue("", (java.lang.Object) contextedRuntimeException7);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException102");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException7.getSuppressed();
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException103");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj9 = contextedRuntimeException7.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException104");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException105");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2, exceptionContext7);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException106");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException107");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str8 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException108");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException109");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException110");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = objList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException111");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.String str8 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException112");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj5 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedRuntimeException113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException113");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException114");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException2.getContextValues("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException115");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException116");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.String str8 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException117");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.lang.Class<?> wildcardClass8 = strPairList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
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
    public void ContextedRuntimeException118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException118");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException119");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.String str8 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException120");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "hi!");
        java.lang.String str7 = contextedRuntimeException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException121");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException122");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Object) 100L);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException6.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException123");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.addContextValue("", (java.lang.Object) contextedRuntimeException7);
        java.lang.String str9 = contextedRuntimeException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedRuntimeException124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException124");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.lang.Object obj9 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException125");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException126");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.Object obj5 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        // The following exception was thrown during execution in ContextedRuntimeException generation
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
    public void ContextedRuntimeException127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException127");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException4.getContextLabels();
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException128");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
    }

    @Test
    public void ContextedRuntimeException129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException129");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException0.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Object obj8 = contextedRuntimeException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
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
    public void ContextedRuntimeException130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException130");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException5.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException131");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass4 = strPairList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException132");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException1.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
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
    public void ContextedRuntimeException133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException133");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException1.getClass();
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
    public void ContextedRuntimeException134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException134");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.String str4 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException135");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException136");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException2.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj7);
        java.lang.String str9 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException137");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj8 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException1);
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
    public void ContextedRuntimeException138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException138");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException2.getSuppressed();
        java.lang.String str9 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException139");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException140");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
    }

    @Test
    public void ContextedRuntimeException141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException141");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException5.getContextValues("");
        java.lang.Object obj9 = contextedRuntimeException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException142");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException4.getClass();
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
    public void ContextedRuntimeException143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException143");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException6.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException6.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException144");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        java.lang.String str7 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException145");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException146");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException147");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // The following exception was thrown during execution in ContextedRuntimeException generation
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
    public void ContextedRuntimeException148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException148");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable1);
        java.lang.String str3 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException149");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException2.getSuppressed();
        java.lang.String str8 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException150");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException3.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException3.getContextLabels();
        java.lang.String str7 = contextedRuntimeException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
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
    public void ContextedRuntimeException151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException151");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str6 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", throwable1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException152");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException153");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException0.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedRuntimeException154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException154");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException2.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException155");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str9 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException156");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.lang.String str8 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException157");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException158");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException2.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj7);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException159");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.String str9 = contextedRuntimeException4.getRawMessage();
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
    public void ContextedRuntimeException160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException160");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException161");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj7 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedRuntimeException162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException162");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str7 = contextedRuntimeException4.getFormattedExceptionMessage("hi!");
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException163");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException7.getContextLabels();
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException7.getSuppressed();
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
    public void ContextedRuntimeException164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException164");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException1.getContextLabels();
        java.lang.String str8 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException165");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException166");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException167");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException168");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str9 = contextedRuntimeException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException169");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException170");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException0.getClass();
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
    public void ContextedRuntimeException171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException171");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.lang.String str8 = contextedRuntimeException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException172");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException0.getClass();
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
    public void ContextedRuntimeException173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException173");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
    }

    @Test
    public void ContextedRuntimeException174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException174");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        java.lang.String str9 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException175");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedRuntimeException176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException176");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException177");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException178");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException4.getContextLabels();
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException179");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException180");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) 0);
        java.lang.String str7 = contextedRuntimeException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException181");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException7.getSuppressed();
        java.lang.String str9 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException182");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException183");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException2.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj7);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException184");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.setContextValue("", (java.lang.Object) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException185");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException186");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.String str3 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException0.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void ContextedRuntimeException187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException187");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException2.getContextLabels();
        java.lang.Object obj9 = contextedRuntimeException2.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException188");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("");
        java.lang.String str8 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException189");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.lang.Class<?> wildcardClass8 = strSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException190");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException0.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException0.getRawMessage();
        java.lang.Class<?> wildcardClass7 = contextedRuntimeException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException191");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedRuntimeException192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException192");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException193");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException194");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException195");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException0.getContextLabels();
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
    public void ContextedRuntimeException196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException196");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable1);
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException2.getContextLabels();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException197");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.String str5 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException198");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException199");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedRuntimeException200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException200");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str6 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException201");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException202");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.String str6 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException203");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException204");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException5.getContextLabels();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException5.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException205");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ContextedRuntimeException206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException206");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass7 = objList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException207");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException208");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException2.getSuppressed();
        java.lang.String str9 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException209");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException6.getContextEntries();
        java.lang.String str8 = contextedRuntimeException6.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ContextedRuntimeException210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException210");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Object) 100L);
        java.lang.String str7 = contextedRuntimeException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException211");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException212");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) 0L);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
    }

    @Test
    public void ContextedRuntimeException213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException213");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str8 = contextedRuntimeException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException214");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException3.getSuppressed();
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
    public void ContextedRuntimeException215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException215");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.Object obj5 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        java.lang.String str7 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException216");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.lang.Object obj8 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException217");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ContextedRuntimeException218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException218");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
    }

    @Test
    public void ContextedRuntimeException219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException219");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) 0L);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException220");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        java.lang.Object obj6 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
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
    public void ContextedRuntimeException221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException221");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException6.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException222");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException223");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.lang.String str7 = contextedRuntimeException3.getRawMessage();
        java.lang.String str8 = contextedRuntimeException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void ContextedRuntimeException224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException224");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str7 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException225");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str8 = contextedRuntimeException7.getRawMessage();
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException226");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
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
    public void ContextedRuntimeException227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException227");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.Class<?> wildcardClass2 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedRuntimeException228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException228");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException229");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException230");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.lang.Throwable throwable4 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable4);
        java.lang.String str7 = contextedRuntimeException5.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException231");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException232");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException233");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException234");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", throwable1);
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedRuntimeException235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException235");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException3.getSuppressed();
        java.lang.String str8 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException236");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Object obj8 = contextedRuntimeException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException237");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.Object obj8 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException238");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException8.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException239");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.String str9 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException240");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException6.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException241");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.lang.String str8 = contextedRuntimeException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException242");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException243");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        java.lang.String str6 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException244");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ContextedRuntimeException245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException245");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException246");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException2.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException2.getSuppressed();
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
    public void ContextedRuntimeException247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException247");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.lang.Object obj7 = contextedRuntimeException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException248");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2, exceptionContext7);
        java.lang.String str9 = contextedRuntimeException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException249");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException250");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException4.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException251");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException252");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str7 = contextedRuntimeException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException253");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException2.getContextEntries();
        java.lang.Class<?> wildcardClass6 = strPairList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException254");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException(throwable0);
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException255");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException256");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException257");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException5.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException258");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.Object obj7 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedRuntimeException259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException259");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.lang.Object obj8 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException260");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException6.getRawMessage();
        java.lang.String str9 = contextedRuntimeException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException261");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException5.getContextEntries();
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException5.getSuppressed();
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
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
    public void ContextedRuntimeException262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException262");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        java.lang.String str6 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException263");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str7 = contextedRuntimeException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException264");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str6 = contextedRuntimeException5.getRawMessage();
        java.lang.Object obj8 = contextedRuntimeException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException265");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) 0L);
        java.lang.String str8 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException266");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedRuntimeException267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException267");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException268");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException269");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        java.lang.String str7 = contextedRuntimeException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException270");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str5 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException271");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException3.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException3.getContextLabels();
        java.lang.String str7 = contextedRuntimeException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException8);
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
    public void ContextedRuntimeException272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException272");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void ContextedRuntimeException273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException273");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException274");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException275");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException276");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException277");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException278");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException279");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException280");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException2.getContextEntries();
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedRuntimeException281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException281");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Class<?> wildcardClass2 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedRuntimeException282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException282");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.lang.String str8 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException283");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", throwable1);
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException284");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        java.lang.String str7 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException285");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.lang.String str8 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException286");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Class<?> wildcardClass2 = contextedRuntimeException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ContextedRuntimeException287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException287");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException4.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException4.getContextLabels();
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException4.getContextLabels();
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
    public void ContextedRuntimeException288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException288");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException289");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.lang.String str8 = contextedRuntimeException1.getFormattedExceptionMessage("");
        java.lang.String str9 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException290");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) strSet6);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException7.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException291");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", throwable1);
        java.lang.Class<?> wildcardClass3 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedRuntimeException292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException292");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException1.setContextValue("", (java.lang.Object) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException293");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.String str3 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException294");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.lang.Object obj8 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException295");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedRuntimeException296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException296");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException297");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException298");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException7.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException299");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException300");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
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
    public void ContextedRuntimeException301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException301");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
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
    public void ContextedRuntimeException302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException302");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedRuntimeException303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException303");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.addContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str9 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedRuntimeException304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException304");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
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
    public void ContextedRuntimeException305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException305");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj8 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1);
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
    public void ContextedRuntimeException306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException306");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj6 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedRuntimeException307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException307");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException308");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException3.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException309");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedRuntimeException310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException310");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException311");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void ContextedRuntimeException312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException312");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException1.getClass();
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
    public void ContextedRuntimeException313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException313");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
    }

    @Test
    public void ContextedRuntimeException314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException314");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException315");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) 0);
        java.lang.String str8 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException316");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", throwable1);
    }

    @Test
    public void ContextedRuntimeException317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException317");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.lang.String str8 = contextedRuntimeException3.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
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
    public void ContextedRuntimeException318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException318");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedRuntimeException319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException319");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void ContextedRuntimeException320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException320");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException3.getRawMessage();
        java.lang.Object obj8 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException321");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.String str7 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str9 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException322");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException323");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.String str3 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException0.getFirstContextValue("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException324");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException7.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException325");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj9 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException326");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException327");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException4.getSuppressed();
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
    public void ContextedRuntimeException328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException328");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException329");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
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
    public void ContextedRuntimeException330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException330");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException3.getSuppressed();
        java.lang.String str8 = contextedRuntimeException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void ContextedRuntimeException331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException331");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Object) 100L);
        java.lang.Object obj8 = contextedRuntimeException6.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str9 = contextedRuntimeException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException332");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
    }

    @Test
    public void ContextedRuntimeException333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException333");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.addContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj8 = contextedRuntimeException6.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException334");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException335");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException336");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        java.lang.String str8 = contextedRuntimeException7.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException337");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException4.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException4.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException338");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException339");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.lang.String str8 = contextedRuntimeException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException340");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void ContextedRuntimeException341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException341");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str8 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException342");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException343");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException344");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException345");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("hi!");
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException1.getSuppressed();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException1.getClass();
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
    public void ContextedRuntimeException346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException346");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedRuntimeException347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException347");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
    }

    @Test
    public void ContextedRuntimeException348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException348");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException1.getContextLabels();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
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
    public void ContextedRuntimeException349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException349");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException350");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj7);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
    }

    @Test
    public void ContextedRuntimeException351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException351");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException352");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void ContextedRuntimeException353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException353");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException354");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.lang.String str5 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException355");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str7 = contextedRuntimeException5.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException356");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException7.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException357");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException358");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedRuntimeException359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException359");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException6.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException6);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException360");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException361");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException362");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.Class<?> wildcardClass3 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedRuntimeException363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException363");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException4.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException4.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
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
    public void ContextedRuntimeException364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException364");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException6.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException365");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
    }

    @Test
    public void ContextedRuntimeException366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException366");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException7.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException367");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedRuntimeException368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException368");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        java.lang.Object obj5 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException6.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException369");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException370");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException371");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.Class<?> wildcardClass6 = strPairList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException372");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str9 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException373");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.String str3 = contextedRuntimeException0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException374");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException375");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException376");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.lang.Class<?> wildcardClass7 = strPairList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException377");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException378");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        contextedRuntimeException3.addSuppressed((java.lang.Throwable) contextedRuntimeException7);
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException379");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException380");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException381");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj5);
        java.lang.String str8 = contextedRuntimeException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException382");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str7 = contextedRuntimeException4.getFormattedExceptionMessage("hi!");
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException383");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException1.getContextEntries();
        java.lang.String str9 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException384");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException385");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException7);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException386");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException2.getSuppressed();
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException387");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Object) 100L);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException388");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException389");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        java.lang.String str5 = contextedRuntimeException3.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException6.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException390");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str7 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException391");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4, exceptionContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void ContextedRuntimeException392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException392");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.lang.String str7 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException393");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) 1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
    }

    @Test
    public void ContextedRuntimeException394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException394");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        contextedRuntimeException0.addSuppressed((java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedRuntimeException395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException395");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
    }

    @Test
    public void ContextedRuntimeException396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException396");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException397");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException2.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedRuntimeException398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException398");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedRuntimeException399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException399");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException0.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
    }

    @Test
    public void ContextedRuntimeException400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException400");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
    }

    @Test
    public void ContextedRuntimeException401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException401");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable1);
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException402");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException403");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException2.getSuppressed();
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        java.lang.Object obj8 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
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
    public void ContextedRuntimeException404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException404");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
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
    public void ContextedRuntimeException405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException405");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException406");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException4.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException4.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException407");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj8 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException2.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException408");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException1.getSuppressed();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException409");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException2.getSuppressed();
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException2.getClass();
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
    public void ContextedRuntimeException410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException410");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException1.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
    }

    @Test
    public void ContextedRuntimeException411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException411");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext8 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5, exceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
    }

    @Test
    public void ContextedRuntimeException412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException412");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.lang.String str5 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException413");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException414");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj8 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException3.getClass();
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
    public void ContextedRuntimeException415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException415");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.lang.String str9 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException416");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException417");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedRuntimeException418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException418");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
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
    public void ContextedRuntimeException419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException419");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException420");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException0.addSuppressed(throwable6);
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
    public void ContextedRuntimeException421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException421");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        java.lang.String str6 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str8 = contextedRuntimeException7.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException422");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", throwable1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedRuntimeException423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException423");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str7 = contextedRuntimeException6.getRawMessage();
        java.lang.String str8 = contextedRuntimeException6.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException424");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException3.setContextValue("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", obj7);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException425");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException426");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj8 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1);
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
    public void ContextedRuntimeException427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException427");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException428");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException5.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException429");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.lang.String str7 = contextedRuntimeException5.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException5.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
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
    public void ContextedRuntimeException430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException430");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException1.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException431");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException432");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        java.lang.Object obj9 = contextedRuntimeException1.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
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
    public void ContextedRuntimeException433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException433");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException434");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException435");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException436");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException6.getContextEntries();
        java.lang.String str8 = contextedRuntimeException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException437");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.lang.String str8 = contextedRuntimeException5.getFormattedExceptionMessage("hi!");
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException5.getSuppressed();
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
    public void ContextedRuntimeException438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException438");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException439");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("hi!");
        java.lang.String str5 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException440");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void ContextedRuntimeException441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException441");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException1.getContextLabels();
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
    public void ContextedRuntimeException442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException442");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException443");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.Object obj9 = contextedRuntimeException7.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException444");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
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
    public void ContextedRuntimeException445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException445");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        java.lang.String str5 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.Object obj9 = contextedRuntimeException1.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException446");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException4.getSuppressed();
        java.lang.String str8 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ContextedRuntimeException447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException447");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj6);
        java.lang.String str8 = contextedRuntimeException2.getRawMessage();
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException448");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str7 = contextedRuntimeException6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException449");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException450");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException451");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException3.getContextLabels();
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException452");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.lang.String str6 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException0.getContextValues("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException453");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void ContextedRuntimeException454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException454");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException1.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
    }

    @Test
    public void ContextedRuntimeException455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException455");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.String str8 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException456");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj8 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
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
    public void ContextedRuntimeException457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException457");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
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
    public void ContextedRuntimeException458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException458");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException2.getContextLabels();
        java.lang.String str8 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException459");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException460");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable1);
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException6.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException461");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("hi!");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException1.getSuppressed();
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
    public void ContextedRuntimeException462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException462");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException2.getSuppressed();
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException2.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException463");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException464");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.String str3 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException465");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.String str3 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str5 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.lang.Object obj8 = contextedRuntimeException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException466");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException1.getContextLabels();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
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
    public void ContextedRuntimeException467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException467");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        org.apache.commons.lang3.exception.ExceptionContext exceptionContext7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2, exceptionContext7);
        java.lang.String str9 = contextedRuntimeException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException468");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void ContextedRuntimeException469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException469");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException0.getContextLabels();
        java.lang.Class<?> wildcardClass3 = strSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedRuntimeException470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException470");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException3.getRawMessage();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException3.getContextLabels();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
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
    public void ContextedRuntimeException471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException471");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException5.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException1.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException472");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.String str7 = contextedRuntimeException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException473");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException(throwable0);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException(throwable0);
    }

    @Test
    public void ContextedRuntimeException474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException474");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException475");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void ContextedRuntimeException476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException476");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        java.lang.Object obj7 = contextedRuntimeException5.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException477");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj5 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedRuntimeException478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException478");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException7.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException479");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException480");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException481");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException5);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException482");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str9 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException483");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "hi!");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
        java.lang.String str9 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException484");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException2.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str7 = contextedRuntimeException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException485");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException5.getContextEntries();
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
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
    public void ContextedRuntimeException486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException486");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", obj5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException6.getContextEntries();
        java.lang.String str9 = contextedRuntimeException6.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException487");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.lang.String str5 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException488");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException7.getContextLabels();
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
    public void ContextedRuntimeException489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException489");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable1);
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void ContextedRuntimeException490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException490");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj5 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in ContextedRuntimeException generation
        try {
            contextedRuntimeException3.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedRuntimeException491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException491");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedRuntimeException492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException492");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str4 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException493");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException5.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException494");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException495");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException3.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException496");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str4 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException497");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException498");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException2.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException499");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException0.ContextedRuntimeException500");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }
}

