
package ContextedRuntimeException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedRuntimeException1 {

    public static boolean debug = false;

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test501");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException6.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------", (java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test502");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException5.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test503");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException1.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test504");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test505");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test506");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = objList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test507");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException6.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test508");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ", obj7);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test509");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass6 = strPairList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test510");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Class<?> wildcardClass3 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test511");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test512");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException4.getSuppressed();
        java.lang.String str8 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test513");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException7);
        java.lang.String str9 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test514");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test515");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test516");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException5.getContextEntries();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test517");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException0.getContextEntries();
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
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test518");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test519");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj7 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test520");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException4.getContextLabels();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test521");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str5 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test522");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException3.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test523");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test524");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.Object obj8 = contextedRuntimeException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test525");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test526");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test527");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
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
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test528");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
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
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test529");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test530");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException1.getContextEntries();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test531");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test532");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str8 = contextedRuntimeException7.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test533");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException3.getRawMessage();
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test534");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.lang.String str5 = contextedRuntimeException1.getRawMessage();
        java.lang.String str7 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test535");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.String str4 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test536");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.lang.Object obj9 = contextedRuntimeException7.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test537");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test538");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException4.getContextLabels();
        java.lang.String str8 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test539");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str7 = contextedRuntimeException6.getRawMessage();
        java.lang.String str8 = contextedRuntimeException6.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = contextedRuntimeException2.setContextValue("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test540");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass7 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test541");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException8.getClass();
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
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test542");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str4 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test543");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str3 = contextedRuntimeException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.lang.String str6 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test544");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Object obj6 = contextedRuntimeException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test545");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1);
        java.lang.String str5 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test546");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("");
        java.lang.Object obj8 = contextedRuntimeException3.getFirstContextValue("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test547");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException3.getSuppressed();
        java.lang.String str9 = contextedRuntimeException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test548");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException1.getContextLabels();
        java.lang.String str8 = contextedRuntimeException1.getFormattedExceptionMessage("");
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test549");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedRuntimeException0.getContextEntries();
        java.lang.String str6 = contextedRuntimeException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.Object obj8 = contextedRuntimeException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test550");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException6);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        java.lang.String str9 = contextedRuntimeException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test551");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.String str4 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test552");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj5 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException6.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test553");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Object) 0L);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test554");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException7.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test555");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test556");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test557");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException1.getSuppressed();
        java.lang.String str6 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------=100.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------=100.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test558");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str9 = contextedRuntimeException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test559");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str6 = contextedRuntimeException5.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test560");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException4);
        java.lang.String str6 = contextedRuntimeException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException7.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test561");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException4);
        java.util.List<java.lang.Object> objList8 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test562");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1);
        java.lang.Object obj4 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test563");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException2.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException2.getContextEntries();
        java.lang.String str8 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test564");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException2.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test565");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", throwable1);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test566");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.lang.String str6 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test567");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test568");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test569");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet8 = contextedRuntimeException2.getContextLabels();
        java.lang.Class<?> wildcardClass9 = contextedRuntimeException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test570");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test571");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.String str4 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test572");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str8 = contextedRuntimeException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: "));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test573");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedRuntimeException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test574");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Throwable) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedRuntimeException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test575");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.setContextValue("hi!", (java.lang.Object) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.lang.Class<?> wildcardClass8 = contextedRuntimeException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test576");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException3.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException7);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException7.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test577");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException1);
        java.lang.Object obj7 = contextedRuntimeException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        java.lang.String str8 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test578");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        java.lang.String str7 = contextedRuntimeException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test579");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedRuntimeException3.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test580");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet3 = contextedRuntimeException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException2.getSuppressed();
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test581");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test582");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException1.getRawMessage();
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test583");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.lang.Object obj6 = contextedRuntimeException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test584");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException3.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test585");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test586");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test587");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", (java.lang.Throwable) contextedRuntimeException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test588");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        java.lang.String str9 = contextedRuntimeException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test589");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException2.getContextEntries();
        java.lang.String str4 = contextedRuntimeException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test590");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("hi!", (java.lang.Object) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        contextedRuntimeException1.addSuppressed((java.lang.Throwable) contextedRuntimeException5);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test591");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException2.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test592");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("hi!", (java.lang.Object) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException3.getContextValues("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test593");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1);
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
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
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test594");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ", (java.lang.Object) 100L);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.util.List<java.lang.Object> objList9 = contextedRuntimeException7.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test595");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str6 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedRuntimeException3.getContextEntries();
        java.lang.String str8 = contextedRuntimeException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test596");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException4.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test597");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test598");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException1.getRawMessage();
        java.lang.String str6 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test599");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException3.getSuppressed();
        java.lang.Throwable[] throwableArray8 = contextedRuntimeException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test600");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        java.lang.String str7 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = contextedRuntimeException8.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test601");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Object obj5 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        java.lang.Object obj7 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedRuntimeException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test602");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException5.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException5.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test603");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedRuntimeException1.getContextEntries();
        java.lang.Class<?> wildcardClass4 = strPairList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str2.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test604");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.String str4 = contextedRuntimeException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test605");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException1.getContextEntries();
        java.lang.String str6 = contextedRuntimeException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test606");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException6);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException6);
        java.util.Set<java.lang.String> strSet9 = contextedRuntimeException8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test607");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test608");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException7);
        java.lang.Throwable[] throwableArray9 = contextedRuntimeException8.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test609");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedRuntimeException1.getSuppressed();
        java.lang.Object obj4 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Object obj6 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test610");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        java.lang.String str2 = contextedRuntimeException1.getRawMessage();
        java.lang.String str3 = contextedRuntimeException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException1);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException4.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.lang.String str7 = contextedRuntimeException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test611");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.Throwable[] throwableArray4 = contextedRuntimeException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test612");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedRuntimeException1.getContextLabels();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException1.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedRuntimeException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test613");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        java.lang.Throwable[] throwableArray3 = contextedRuntimeException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
        java.lang.String str5 = contextedRuntimeException2.getRawMessage();
        java.lang.Object obj7 = contextedRuntimeException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test614");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedRuntimeException1.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test615");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedRuntimeException1.getContextEntries();
        java.lang.Object obj8 = contextedRuntimeException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test616");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = contextedRuntimeException2.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException7 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test617");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = contextedRuntimeException0.addContextValue("hi!", (java.lang.Object) contextedRuntimeException2);
        java.util.List<java.lang.Object> objList5 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = contextedRuntimeException3.getContextValues("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException3);
        java.lang.String str9 = contextedRuntimeException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test618");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet2 = contextedRuntimeException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = new org.apache.commons.lang3.exception.ContextedRuntimeException("");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException("", (java.lang.Throwable) contextedRuntimeException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedRuntimeException4);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException4.getContextLabels();
        java.lang.String str8 = contextedRuntimeException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str9 = contextedRuntimeException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test619");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException1 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException4 = contextedRuntimeException1.addContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedRuntimeException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = contextedRuntimeException4.setContextValue("org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedRuntimeException: ");
        java.lang.String str9 = contextedRuntimeException8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------=100.0]\n\t[2:org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------=100.0]\n\t[2:org.apache.commons.lang3.exception.ContextedRuntimeException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test620");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!", throwable1);
        java.lang.String str4 = contextedRuntimeException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray5 = contextedRuntimeException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedRuntimeException2.getSuppressed();
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedRuntimeException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test621");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException6 = contextedRuntimeException3.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet7 = contextedRuntimeException3.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException8 = new org.apache.commons.lang3.exception.ContextedRuntimeException("hi!", (java.lang.Throwable) contextedRuntimeException3);
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException9 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedRuntimeException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test622");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException3 = new org.apache.commons.lang3.exception.ContextedRuntimeException("org.apache.commons.lang3.exception.ContextedRuntimeException: org.apache.commons.lang3.exception.ContextedRuntimeException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedRuntimeException2);
    }

    @Test
    public void ContextedRuntimeException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedRuntimeException1.test623");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException0 = new org.apache.commons.lang3.exception.ContextedRuntimeException();
        java.util.Set<java.lang.String> strSet1 = contextedRuntimeException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException2 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException0);
        java.util.List<java.lang.Object> objList4 = contextedRuntimeException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedRuntimeException contextedRuntimeException5 = new org.apache.commons.lang3.exception.ContextedRuntimeException((java.lang.Throwable) contextedRuntimeException2);
        java.util.Set<java.lang.String> strSet6 = contextedRuntimeException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }
}

