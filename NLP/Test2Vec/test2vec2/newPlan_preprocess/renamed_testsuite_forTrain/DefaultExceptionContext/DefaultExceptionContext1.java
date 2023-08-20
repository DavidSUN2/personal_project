
package DefaultExceptionContext;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultExceptionContext1 {

    public static boolean debug = false;

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test501");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test502");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test503");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test504");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test505");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.Object obj2 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj4 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test506");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test507");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.String str2 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.lang.Object obj4 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=-1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str2.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test508");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test509");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test510");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test511");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test512");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test513");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test514");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test515");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test516");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test517");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test518");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test519");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test520");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test521");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test522");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test523");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test524");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.lang.String str2 = defaultExceptionContext0.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------");
        java.util.Set<java.lang.String> strSet3 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------" + "'", str2.equals("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test525");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test526");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test527");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test528");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test529");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test530");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test531");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test532");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test533");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test534");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test535");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test536");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test537");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test538");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test539");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test540");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test541");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test542");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test543");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test544");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test545");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test546");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test547");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test548");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test549");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test550");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test551");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test552");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test553");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test554");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test555");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test556");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test557");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test558");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test559");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test560");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test561");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test562");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test563");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test564");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test565");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test566");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test567");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<java.lang.Object> objList2 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass3 = objList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test568");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test569");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test570");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test571");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test572");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test573");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test574");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test575");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test576");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test577");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test578");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test579");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test580");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test581");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test582");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test583");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test584");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test585");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test586");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test587");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test588");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test589");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test590");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test591");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test592");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test593");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test594");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test595");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test596");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test597");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test598");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test599");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test600");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------", (java.lang.Object) 1.0f);
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------");
        java.lang.Object obj7 = defaultExceptionContext0.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=10]\n\t[2:=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=10]\n---------------------------------\nException Context:\n\t[1:Exception Context:\n\t[1:hi!=10]\n\t[2:=false]\n---------------------------------=1.0]\n---------------------------------");
        // The following exception was thrown during execution in test generation
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test601");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test602");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test603");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test604");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test605");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test606");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test607");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test608");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test609");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test610");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test611");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test612");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test613");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test614");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test615");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test616");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test617");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test618");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test619");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test620");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test621");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test622");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test623");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test624");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test625");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test626");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test627");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test628");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test629");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test630");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test631");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test632");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test633");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test634");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test635");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test636");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test637");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test638");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test639");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test640");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test641");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test642");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test643");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test644");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test645");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test646");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test647");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test648");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test649");
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
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext1.test650");
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

