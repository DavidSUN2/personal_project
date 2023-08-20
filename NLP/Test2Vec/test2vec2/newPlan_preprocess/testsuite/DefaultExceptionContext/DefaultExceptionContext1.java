package DefaultExceptionContext;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultExceptionContext1 {

    public static boolean debug = false;

    @Test
    public void DefaultExceptionContext501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext501");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext502");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext3.getContextValues("");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj9 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext503");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext7 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", (java.lang.Object) true);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext7.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext7.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext504");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str7 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext3.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext505");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.Object obj2 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj4 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void DefaultExceptionContext506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext506");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void DefaultExceptionContext507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext507");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.String str2 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj4 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str2.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void DefaultExceptionContext508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext508");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
    }

    @Test
    public void DefaultExceptionContext509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext509");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("", (java.lang.Object) false);
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj9 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext510");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj8 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext511");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext512");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext513");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", obj7);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext514");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str4 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str4.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext515");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("hi!", (java.lang.Object) (-1.0f));
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext516");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.lang.Class<?> wildcardClass8 = strPairList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext517");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext518");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void DefaultExceptionContext519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext519");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext520");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext521");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext522");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass6 = objList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void DefaultExceptionContext523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext523");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext3.getContextValues("");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext524");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.String str2 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet3 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str2.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void DefaultExceptionContext525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext525");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext6.getContextLabels();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------", (java.lang.Object) strSet7);
        java.lang.Class<?> wildcardClass9 = strSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext526");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext527");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void DefaultExceptionContext528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext528");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------=hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", obj5);
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext6.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext529");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext530");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------=hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", obj5);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext6.setContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------", (java.lang.Object) "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext531");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------", (java.lang.Object) "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext532");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext533");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.lang.String str9 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext534");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("");
        java.lang.Object obj9 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext535");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("hi!", (java.lang.Object) (-1.0f));
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext6.getContextLabels();
        java.lang.String str9 = defaultExceptionContext6.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext536");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext537");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext3.getContextEntries();
        java.lang.String str7 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void DefaultExceptionContext538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext538");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext539");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext540");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str4 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str4.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext541");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext542");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext543");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("", (java.lang.Object) false);
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.lang.String str9 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext544");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext545");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext0.addContextValue("", (java.lang.Object) 1.0d);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext546");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str4 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------", (java.lang.Object) "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str4.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext547");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void DefaultExceptionContext548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext548");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext549");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext550");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext551");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext552");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext553");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext554");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.Class<?> wildcardClass5 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void DefaultExceptionContext555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext555");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.lang.Class<?> wildcardClass8 = strPairList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext556");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void DefaultExceptionContext557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext557");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = defaultExceptionContext0.getContextEntries();
        java.lang.Class<?> wildcardClass3 = strPairList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void DefaultExceptionContext558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext558");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.Object obj2 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet3 = defaultExceptionContext0.getContextLabels();
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void DefaultExceptionContext559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext559");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.lang.Class<?> wildcardClass8 = strPairList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext560");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext561");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext562");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext563");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext7 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", (java.lang.Object) true);
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext564");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void DefaultExceptionContext565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext565");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext566");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext567");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass3 = objList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void DefaultExceptionContext568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext568");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.lang.String str3 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("hi!");
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------" + "'", str3.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext569");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext570");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str9 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext571");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        java.lang.String str9 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext572");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext573");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------");
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext574");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("", (java.lang.Object) false);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext6.getContextEntries();
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext575");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext0.addContextValue("", (java.lang.Object) 1.0d);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext6.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext576");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("hi!");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void DefaultExceptionContext577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext577");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext578");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext579");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext580");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str4 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str4.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void DefaultExceptionContext581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext581");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext0.getFormattedExceptionMessage("hi!");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.lang.String str9 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext582");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = defaultExceptionContext0.getContextEntries();
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext583");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        java.lang.String str9 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext584");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext585");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext3.getContextValues("");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.String str9 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext586");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext0.addContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------", (java.lang.Object) "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext6.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext587");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.String str9 = defaultExceptionContext3.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext588");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.lang.Class<?> wildcardClass7 = strPairList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DefaultExceptionContext589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext589");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("", (java.lang.Object) false);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext6.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext6.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext590");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------", obj7);
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext591");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext592");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
    }

    @Test
    public void DefaultExceptionContext593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext593");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext594");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext595");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void DefaultExceptionContext596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext596");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.lang.Class<?> wildcardClass8 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext597");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void DefaultExceptionContext598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext598");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DefaultExceptionContext599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext599");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext600");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // The following exception was thrown during execution in DefaultExceptionContext generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext601");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext0.getContextLabels();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext602");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext0.getContextLabels();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext603");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext604");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("");
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext605");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext3.setContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------", (java.lang.Object) "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
    }

    @Test
    public void DefaultExceptionContext606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext606");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext3.getContextValues("");
        java.lang.String str7 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext607");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.lang.String str3 = defaultExceptionContext0.getFormattedExceptionMessage("hi!");
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void DefaultExceptionContext608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext608");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext609");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext610");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList3 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = objList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext611");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext612");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext613");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", (java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext614");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext615");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext616");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.lang.String str9 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str9.equals("Exception Context:\n\t[1:hi!=10]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext617");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str7 = defaultExceptionContext3.getFormattedExceptionMessage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext618");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj8 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void DefaultExceptionContext619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext619");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.String str9 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext620");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext621");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
    }

    @Test
    public void DefaultExceptionContext622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext622");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext623");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        java.lang.Class<?> wildcardClass8 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext624");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext625");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------", obj7);
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext8.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext626");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext627");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str4 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str4.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext628");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext629");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext3.getContextValues("");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj9 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext630");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void DefaultExceptionContext631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext631");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext632");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.Object obj2 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet3 = defaultExceptionContext0.getContextLabels();
        java.lang.String str5 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext633");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Object obj9 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext634");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------=hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------=hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------=hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext635");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str5 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Class<?> wildcardClass8 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------" + "'", str5.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext636");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext637");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str9 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext638");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void DefaultExceptionContext639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext639");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext640");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("hi!", (java.lang.Object) (-1.0f));
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext3.setContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------", (java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext641");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext0.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext642");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("hi!", (java.lang.Object) (-1.0f));
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext643");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext644");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.String str4 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.String str6 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str4.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------" + "'", str6.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------=true]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext645");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext3.getContextLabels();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext646");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass8 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------" + "'", str7.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void DefaultExceptionContext647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext647");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        java.lang.String str6 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext648");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        java.lang.String str5 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext3.getContextEntries();
        java.lang.Class<?> wildcardClass7 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str5.equals("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DefaultExceptionContext649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext649");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.Set<java.lang.String> strSet1 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList2 = defaultExceptionContext0.getContextEntries();
        java.lang.Object obj4 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n\t[2:hi!=1]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext7 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------", (java.lang.Object) "hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext7);
    }

    @Test
    public void DefaultExceptionContext650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.DefaultExceptionContext650");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) (short) 10);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("hi!", (java.lang.Object) (-1.0f));
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.lang.Class<?> wildcardClass8 = defaultExceptionContext6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

