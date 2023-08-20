package ContextedException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContextedException1 {

    public static boolean debug = false;

    @Test
    public void ContextedException501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException501");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj5 = contextedException3.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        org.apache.commons.lang3.exception.ContextedException contextedException7 = new org.apache.commons.lang3.exception.ContextedException("", (java.lang.Throwable) contextedException3);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in ContextedException generation
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
    public void ContextedException502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException502");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.lang.Throwable[] throwableArray2 = contextedException1.getSuppressed();
        java.lang.Object obj4 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedException503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException503");
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
    public void ContextedException504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException504");
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
    public void ContextedException505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException505");
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
    public void ContextedException506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException506");
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
    public void ContextedException507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException507");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        java.lang.String str2 = contextedException1.getRawMessage();
        java.lang.String str4 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException508");
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
    public void ContextedException509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException509");
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
    public void ContextedException510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException510");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.lang.String str4 = contextedException2.getRawMessage();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------"));
    }

    @Test
    public void ContextedException511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException511");
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
    public void ContextedException512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException512");
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
    public void ContextedException513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException513");
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
    public void ContextedException514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException514");
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
    public void ContextedException515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException515");
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
    public void ContextedException516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException516");
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
    public void ContextedException517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException517");
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
    public void ContextedException518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException518");
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
    public void ContextedException519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException519");
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
    public void ContextedException520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException520");
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
    public void ContextedException521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException521");
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
    public void ContextedException522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException522");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        java.lang.Class<?> wildcardClass3 = contextedException2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ContextedException523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException523");
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
    public void ContextedException524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException524");
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
    public void ContextedException525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException525");
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
    public void ContextedException526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException526");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException527");
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
    public void ContextedException528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException528");
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
    public void ContextedException529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException529");
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
    public void ContextedException530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException530");
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
    public void ContextedException531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException531");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("");
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void ContextedException532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException532");
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
    public void ContextedException533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException533");
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
    public void ContextedException534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException534");
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
    public void ContextedException535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException535");
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
    public void ContextedException536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException536");
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
    public void ContextedException537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException537");
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
    public void ContextedException538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException538");
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
    public void ContextedException539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException539");
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
    public void ContextedException540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException540");
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
    public void ContextedException541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException541");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        org.apache.commons.lang3.exception.ContextedException contextedException4 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException0);
        java.lang.Throwable[] throwableArray5 = contextedException0.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void ContextedException542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException542");
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
    public void ContextedException543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException543");
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
    public void ContextedException544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException544");
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
    public void ContextedException545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException545");
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
    public void ContextedException546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException546");
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
    public void ContextedException547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException547");
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
    public void ContextedException548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException548");
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
    public void ContextedException549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException549");
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
    public void ContextedException550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException550");
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
    public void ContextedException551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException551");
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
    public void ContextedException552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException552");
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
    public void ContextedException553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException553");
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
    public void ContextedException554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException554");
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
    public void ContextedException555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException555");
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
    public void ContextedException556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException556");
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
    public void ContextedException557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException557");
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
    public void ContextedException558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException558");
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
    public void ContextedException559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException559");
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
    public void ContextedException560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException560");
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
    public void ContextedException561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException561");
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
    public void ContextedException562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException562");
        org.apache.commons.lang3.exception.ContextedException contextedException0 = new org.apache.commons.lang3.exception.ContextedException();
        java.util.Set<java.lang.String> strSet1 = contextedException0.getContextLabels();
        java.lang.Throwable[] throwableArray2 = contextedException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = contextedException0.getSuppressed();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = contextedException0.getContextEntries();
        java.lang.String str6 = contextedException0.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: ");
        java.lang.Object obj8 = contextedException0.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // The following exception was thrown during execution in ContextedException generation
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
    public void ContextedException563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException563");
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
    public void ContextedException564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException564");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!");
        java.util.Set<java.lang.String> strSet2 = contextedException1.getContextLabels();
        java.lang.String str4 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str4.equals("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
    }

    @Test
    public void ContextedException565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException565");
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
    public void ContextedException566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException566");
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
    public void ContextedException567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException567");
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
    public void ContextedException568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException568");
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
    public void ContextedException569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException569");
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
    public void ContextedException570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException570");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("hi!");
        org.apache.commons.lang3.exception.ContextedException contextedException3 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=10.0]\n---------------------------------", (java.lang.Throwable) contextedException2);
        java.util.Set<java.lang.String> strSet4 = contextedException2.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException571");
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
    public void ContextedException572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException572");
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
    public void ContextedException573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException573");
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
    public void ContextedException574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException574");
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
    public void ContextedException575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException575");
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
    public void ContextedException576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException576");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------", throwable1);
        java.lang.Object obj4 = contextedException2.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void ContextedException577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException577");
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
    public void ContextedException578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException578");
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
    public void ContextedException579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException579");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=[]]\n---------------------------------", throwable1);
    }

    @Test
    public void ContextedException580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException580");
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
    public void ContextedException581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException581");
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
    public void ContextedException582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException582");
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
    public void ContextedException583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException583");
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
    public void ContextedException584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException584");
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
    public void ContextedException585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException585");
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
    public void ContextedException586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException586");
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
    public void ContextedException587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException587");
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
    public void ContextedException588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException588");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("");
        java.lang.String str3 = contextedException1.getFormattedExceptionMessage("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = contextedException1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------" + "'", str3.equals("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ContextedException589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException589");
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
    public void ContextedException590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException590");
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
    public void ContextedException591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException591");
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
    public void ContextedException592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException592");
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
    public void ContextedException593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException593");
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
    public void ContextedException594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException594");
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
    public void ContextedException595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException595");
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
    public void ContextedException596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException596");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------");
    }

    @Test
    public void ContextedException597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException597");
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
    public void ContextedException598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException598");
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
    public void ContextedException599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException599");
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
    public void ContextedException600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException600");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------");
        java.lang.Object obj3 = contextedException1.getFirstContextValue("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n\t[2:=null]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet4 = contextedException1.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void ContextedException601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException601");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: Exception Context:\n\t[1:hi!=10.0]\n---------------------------------\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!=0]\n---------------------------------");
        java.util.List<java.lang.Object> objList3 = contextedException1.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------\nException Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
    }

    @Test
    public void ContextedException602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException602");
        org.apache.commons.lang3.exception.ContextedException contextedException2 = new org.apache.commons.lang3.exception.ContextedException("Exception Context:\n\t[1:hi!=org.apache.commons.lang3.exception.ContextedException: ]\n---------------------------------");
        java.util.List<java.lang.Object> objList4 = contextedException2.getContextValues("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: =null]\n---------------------------------");
        org.apache.commons.lang3.exception.ContextedException contextedException5 = new org.apache.commons.lang3.exception.ContextedException((java.lang.Throwable) contextedException2);
        org.apache.commons.lang3.exception.ContextedException contextedException6 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!", (java.lang.Throwable) contextedException2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList4);
    }

    @Test
    public void ContextedException603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException603");
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
    public void ContextedException604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException604");
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
    public void ContextedException605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException605");
        org.apache.commons.lang3.exception.ContextedException contextedException1 = new org.apache.commons.lang3.exception.ContextedException("org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:org.apache.commons.lang3.exception.ContextedException: hi!\nException Context:\n\t[1:hi!=10.0]\n---------------------------------=hi!]\n---------------------------------");
    }

    @Test
    public void ContextedException606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException606");
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
    public void ContextedException607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ContextedException1.ContextedException607");
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

