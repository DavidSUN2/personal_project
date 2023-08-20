
package ContextedException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedException1 {

    public static boolean debug = false;

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test501");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj5 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            contextedException3.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test502");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test503");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str4 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test504");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.Set<java.lang.String> strSet4 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.lang.Throwable[] throwableArray6 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException5.addContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
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
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test505");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test506");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.lang.String str6 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedException3.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test507");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str4 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test508");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str8 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test509");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException2.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        java.lang.Throwable[] throwableArray7 = contextedException2.getSuppressed();
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test510");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test511");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList9 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test512");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException6.setContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------", (java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test513");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        java.lang.String str9 = contextedException5.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test514");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.Set<java.lang.String> strSet5 = contextedException1.getContextLabels();
        java.util.List<java.lang.Object> objList7 = contextedException1.getContextValues("");
        java.lang.Throwable[] throwableArray8 = contextedException1.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test515");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = contextedException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test516");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test517");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = objList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test518");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<java.lang.Object> objList8 = contextedException6.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException9 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test519");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException4.getRawMessage();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.setContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ", obj7);
        java.util.Set<java.lang.String> strSet9 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test520");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        java.lang.String str8 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test521");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test522");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Class<?> wildcardClass3 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test523");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        java.lang.String str4 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.lang.Throwable[] throwableArray8 = contextedException5.getSuppressed();
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test524");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        java.lang.Throwable[] throwableArray7 = contextedException4.getSuppressed();
        java.lang.String str8 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test525");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str6 = contextedException4.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException7);
        java.lang.String str9 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test526");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test527");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException2.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test528");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException5.getContextEntries();
        java.lang.Throwable[] throwableArray7 = contextedException5.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test529");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException0.getContextEntries();
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test530");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable1);
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray5 = contextedException2.getSuppressed();
        java.lang.Throwable[] throwableArray6 = contextedException2.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test531");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test532");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj7 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=1]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test533");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet7 = contextedException4.getContextLabels();
        java.util.List<java.lang.Object> objList9 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test534");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.String str5 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test535");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = contextedException3.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test536");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray8 = contextedException4.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test537");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.Object obj8 = contextedException6.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
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
            System.out.format("%n%s%n", "ContextedException1.test538");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test539");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException5.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException5.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test540");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList9 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: \nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
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
            System.out.format("%n%s%n", "ContextedException1.test541");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.lang.Throwable[] throwableArray5 = contextedException0.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test542");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!");
        java.util.Set<java.lang.String> strSet6 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException2.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test543");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException1.getContextEntries();
        java.util.List<java.lang.Object> objList6 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test544");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: ");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException1.setContextValue("", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test545");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.String str8 = contextedException7.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test546");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedException3.getRawMessage();
        java.util.Set<java.lang.String> strSet8 = contextedException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test547");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.lang.String str5 = contextedException1.getRawMessage();
        java.lang.String str7 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test548");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.String str4 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str6 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test549");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Object obj9 = contextedException7.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test550");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.util.Set<java.lang.String> strSet8 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test551");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = contextedException4.getContextLabels();
        java.lang.String str8 = contextedException4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test552");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str7 = contextedException6.getRawMessage();
        java.lang.String str8 = contextedException6.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException9 = contextedException2.setContextValue("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test553");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.Throwable[] throwableArray4 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = contextedException1.getContextEntries();
        java.lang.Class<?> wildcardClass7 = contextedException1.getClass();
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test554");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = contextedException4.setContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Object) "org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Class<?> wildcardClass9 = contextedException8.getClass();
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
            System.out.format("%n%s%n", "ContextedException1.test555");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList7 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test556");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str3 = contextedException2.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.lang.String str6 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test557");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Object obj6 = contextedException4.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test558");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------", (java.lang.Throwable) contextedException1);
        java.lang.String str5 = contextedException4.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test559");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) contextedException3);
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("");
        java.lang.Object obj8 = contextedException3.getFirstContextValue("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        java.lang.Throwable[] throwableArray9 = contextedException3.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test560");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.String str5 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj7 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray8 = contextedException3.getSuppressed();
        java.lang.String str9 = contextedException3.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str5.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test561");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException1.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException1.getContextLabels();
        java.lang.String str8 = contextedException1.getFormattedExceptionMessage("");
        java.util.Set<java.lang.String> strSet9 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
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
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test562");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.lang.String str6 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Object obj8 = contextedException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test563");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray5 = contextedException4.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException6);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("hi!\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException6);
        java.lang.String str9 = contextedException6.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test564");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.String str4 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test565");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj5 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        java.lang.Throwable[] throwableArray7 = contextedException6.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test566");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.setContextValue("hi!", (java.lang.Object) 10.0f);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Object) 0L);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = contextedException1.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test567");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException1, (org.apache.commons.lang3.exception.ExceptionContext) contextedException4);
        java.lang.String str6 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<java.lang.Object> objList9 = contextedException7.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test568");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        java.lang.Throwable[] throwableArray5 = contextedException3.getSuppressed();
        java.util.List<java.lang.Object> objList7 = contextedException3.getContextValues("");
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------", (java.lang.Throwable) contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test569");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet6 = contextedException5.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test570");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test571");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Object) 100.0d);
        java.lang.Throwable[] throwableArray5 = contextedException1.getSuppressed();
        java.lang.String str6 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------=100.0]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------=100.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test572");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str6 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.String str9 = contextedException8.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test573");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str4 = contextedException2.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException2);
        java.lang.String str6 = contextedException5.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test574");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException4);
        java.lang.String str6 = contextedException5.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", (java.lang.Throwable) contextedException5);
        java.util.List<java.lang.Object> objList9 = contextedException7.getContextValues("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test575");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException4);
        java.util.List<java.lang.Object> objList8 = contextedException4.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test576");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1);
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test577");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException2.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = contextedException2.getContextEntries();
        java.lang.String str8 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test578");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException2.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test579");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", throwable1);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test580");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str5 = contextedException2.getRawMessage();
        java.lang.String str6 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str6.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test581");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test582");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str7 = contextedException3.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test583");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet8 = contextedException2.getContextLabels();
        java.lang.Class<?> wildcardClass9 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test584");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test585");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray3 = contextedException2.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException4.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = contextedException4.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test586");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException1.getContextEntries();
        java.lang.String str4 = contextedException1.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test587");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.String str8 = contextedException7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: " + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: "));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test588");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test589");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: ", (java.lang.Throwable) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = contextedException3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test590");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = contextedException2.setContextValue("hi!", (java.lang.Object) contextedException4);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        java.lang.Class<?> wildcardClass8 = contextedException7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test591");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str4 = contextedException3.getRawMessage();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = contextedException3.getContextEntries();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException8 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException7);
        java.lang.Throwable[] throwableArray9 = contextedException7.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test592");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = contextedException1.addContextValue("hi!", (java.lang.Object) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("hi!", (java.lang.Throwable) contextedException1);
        java.lang.Object obj7 = contextedException5.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------=null]\n---------------------------------");
        java.lang.String str8 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!" + "'", str8.equals("org.apache.commons.lang3.exception.ContextedException: hi!"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test593");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException4);
        java.lang.Throwable[] throwableArray6 = contextedException5.getSuppressed();
        java.lang.String str7 = contextedException5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test594");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.util.List<java.lang.Object> objList6 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str7 = contextedException3.getRawMessage();
        java.util.List<java.lang.Object> objList9 = contextedException3.getContextValues("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str7.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test595");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet3 = contextedException2.getContextLabels();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException("");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2, (org.apache.commons.lang3.exception.ExceptionContext) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray8 = contextedException2.getSuppressed();
        java.util.Set<java.lang.String> strSet9 = contextedException2.getContextLabels();
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
            System.out.format("%n%s%n", "ContextedException1.test596");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test597");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        java.lang.String str4 = contextedException1.getRawMessage();
        java.lang.Throwable[] throwableArray5 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test598");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.Throwable[] throwableArray4 = contextedException3.getSuppressed();
        java.lang.Object obj6 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test599");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", throwable2);
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------", (java.lang.Throwable) contextedException3);
        java.util.Set<java.lang.String> strSet5 = contextedException3.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = contextedException3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test600");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test601");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test602");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test603");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        java.lang.String str9 = contextedException1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str9.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test604");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = contextedException2.getContextEntries();
        java.lang.String str4 = contextedException2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test605");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test606");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.String str2 = contextedException1.getRawMessage();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException6 = contextedException3.addContextValue("hi!", (java.lang.Object) contextedException5);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException5);
        contextedException1.addSuppressed((java.lang.Throwable) contextedException5);
        java.lang.Throwable[] throwableArray9 = contextedException1.getSuppressed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str2.equals("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void ContextedException() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.test607");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException();
        org.apache.commons.lang3.exception.ContextedException contextedException3 = contextedException0.addContextValue("hi!", (java.lang.Object) contextedException2);
        java.util.List<java.lang.Object> objList5 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(contextedException3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }
}

