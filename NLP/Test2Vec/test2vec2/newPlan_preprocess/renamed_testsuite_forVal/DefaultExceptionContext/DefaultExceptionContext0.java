
package DefaultExceptionContext;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultExceptionContext0 {

    public static boolean debug = false;

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test01");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext6.setContextValue("hi!", (java.lang.Object) (short) 1);
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test02");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext3.setContextValue("", (java.lang.Object) (short) 1);
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test03");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext6.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test04");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test05");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test06");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass7 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test07");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) (short) 10);
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test08");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test09");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList6 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test10");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.lang.Class<?> wildcardClass6 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test11");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Class<?> wildcardClass5 = strSet4.getClass();
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test12");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass4 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test13");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test14");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
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

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test15");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.String str8 = defaultExceptionContext6.getFormattedExceptionMessage("");
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext6.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test16");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext6.setContextValue("", (java.lang.Object) 1.0f);
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test17");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.String str6 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=#]\n---------------------------------");
        java.lang.Class<?> wildcardClass7 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test18");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) 1.0d);
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test19");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("hi!");
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test20");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext5 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext8 = defaultExceptionContext5.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext3.setContextValue("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------", (java.lang.Object) defaultExceptionContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test21");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj7 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test22");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) 1.0d);
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test23");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext7 = defaultExceptionContext0.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test24");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test25");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("hi!");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test26");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.String str8 = defaultExceptionContext6.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------" + "'", str8.equals("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test27");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test28");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.lang.Object obj9 = defaultExceptionContext6.getFirstContextValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test29");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.String str6 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=#]\n---------------------------------");
        java.util.Set<java.lang.String> strSet7 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList9 = defaultExceptionContext3.getContextValues("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------" + "'", str6.equals("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test30");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = defaultExceptionContext3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test31");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test32");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        java.lang.Object obj3 = defaultExceptionContext0.getFirstContextValue("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test33");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------");
        java.lang.Class<?> wildcardClass4 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test34");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj6 = defaultExceptionContext3.getFirstContextValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100 + "'", obj6.equals(100));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test35");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("");
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext0.getContextLabels();
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=#]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test36");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test37");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test38");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.lang.Object obj8 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList9 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test39");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("hi!", (java.lang.Object) 100L);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test40");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext9 = defaultExceptionContext3.addContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------", (java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test41");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        java.util.List<java.lang.Object> objList3 = defaultExceptionContext0.getContextValues("hi!");
        java.util.List<java.lang.Object> objList5 = defaultExceptionContext0.getContextValues("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test42");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.lang.String str9 = defaultExceptionContext6.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------" + "'", str9.equals("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test43");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext0.getContextLabels();
        java.lang.String str8 = defaultExceptionContext0.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test44");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext6.getContextEntries();
        java.lang.Object obj9 = defaultExceptionContext6.getFirstContextValue("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test45");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        java.lang.String str7 = defaultExceptionContext3.getFormattedExceptionMessage("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test46");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------", (java.lang.Object) 1.0d);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test47");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass7 = defaultExceptionContext6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test48");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext3.getContextValues("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        java.util.List<java.lang.Object> objList8 = defaultExceptionContext3.getContextValues("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        java.lang.Class<?> wildcardClass9 = objList8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test49");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList7 = defaultExceptionContext3.getContextValues("");
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test50");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test51");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList8 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=#]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList8);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test52");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.setContextValue("", (java.lang.Object) (byte) 100);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test53");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("hi!", (java.lang.Object) ' ');
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
            System.out.format("%n%s%n", "DefaultExceptionContext0.test54");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.List<java.lang.Object> objList6 = defaultExceptionContext3.getContextValues("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objList6);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test55");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList7 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList7);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test56");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList1 = defaultExceptionContext0.getContextEntries();
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext4 = defaultExceptionContext0.addContextValue("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------", obj3);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext0.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test57");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.Set<java.lang.String> strSet4 = defaultExceptionContext3.getContextLabels();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList5 = defaultExceptionContext3.getContextEntries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test58");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = null;
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext6 = defaultExceptionContext3.addContextValue("Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------", obj5);
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:=100]\n\t[2:Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------=null]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:=100]\n\t[2:Exception Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------=null]\n---------------------------------"));
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test59");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> strPairList4 = defaultExceptionContext0.getContextEntries();
        java.util.Set<java.lang.String> strSet5 = defaultExceptionContext0.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test60");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.setContextValue("", (java.lang.Object) 100);
        java.lang.Object obj5 = defaultExceptionContext3.getFirstContextValue("Exception Context:\n\t[1:hi!=#]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------");
        java.util.Set<java.lang.String> strSet6 = defaultExceptionContext3.getContextLabels();
        java.lang.String str8 = defaultExceptionContext3.getFormattedExceptionMessage("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------");
        java.util.Set<java.lang.String> strSet9 = defaultExceptionContext3.getContextLabels();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------" + "'", str8.equals("hi!\nException Context:\n\t[1:hi!=#]\n\t[2:Exception Context:\n\t[1:hi!=#]\n---------------------------------=1.0]\n---------------------------------\nException Context:\n\t[1:hi!=#]\n\t[2:hi!= ]\n---------------------------------\nException Context:\n\t[1:=100]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void DefaultExceptionContext() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DefaultExceptionContext0.test61");
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext0 = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        org.apache.commons.lang3.exception.DefaultExceptionContext defaultExceptionContext3 = defaultExceptionContext0.addContextValue("hi!", (java.lang.Object) '#');
        java.lang.Object obj5 = defaultExceptionContext0.getFirstContextValue("hi!");
        java.lang.String str7 = defaultExceptionContext0.getFormattedExceptionMessage("");
        java.util.Set<java.lang.String> strSet8 = defaultExceptionContext0.getContextLabels();
        java.lang.Class<?> wildcardClass9 = defaultExceptionContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(defaultExceptionContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Exception Context:\n\t[1:hi!=#]\n---------------------------------" + "'", str7.equals("Exception Context:\n\t[1:hi!=#]\n---------------------------------"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

