package ExceptionUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExceptionUtils0 {

    public static boolean debug = false;

    @Test
    public void ExceptionUtils01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils01");
        java.lang.Throwable throwable0 = null;
        java.lang.String str1 = org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(throwable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void ExceptionUtils02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils02");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils03");
        java.lang.Throwable throwable0 = null;
        java.io.PrintStream printStream1 = null;
        org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(throwable0, printStream1);
    }

    @Test
    public void ExceptionUtils04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils04");
        java.lang.Throwable throwable0 = null;
        java.io.PrintWriter printWriter1 = null;
        org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(throwable0, printWriter1);
    }

    @Test
    public void ExceptionUtils05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils05");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(throwable0);
    }

    @Test
    public void ExceptionUtils06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils06");
        java.lang.Throwable throwable0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(throwable0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExceptionUtils07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils07");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable throwable1 = org.apache.commons.lang3.exception.ExceptionUtils.getRootCause(throwable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(throwable1);
    }

    @Test
    public void ExceptionUtils08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils08");
        java.lang.Throwable throwable0 = null;
        int int1 = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableCount(throwable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void ExceptionUtils09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils09");
        java.lang.Throwable throwable0 = null;
        java.util.List<java.lang.Throwable> throwableList1 = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable0);
        java.lang.Class<?> wildcardClass2 = throwableList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExceptionUtils10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils10");
        java.lang.String[] strArray0 = org.apache.commons.lang3.exception.ExceptionUtils.getDefaultCauseMethodNames();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ExceptionUtils11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils11");
        java.lang.Throwable throwable0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(throwable0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExceptionUtils12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils12");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(throwable0);
        java.lang.Class<?> wildcardClass2 = throwableArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ExceptionUtils13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils13");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils14");
        org.apache.commons.lang3.exception.ExceptionUtils exceptionUtils0 = new org.apache.commons.lang3.exception.ExceptionUtils();
        java.lang.Class<?> wildcardClass1 = exceptionUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ExceptionUtils15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils15");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ExceptionUtils17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils17");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils18");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExceptionUtils19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils19");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExceptionUtils20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils20");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(strList0, (java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void ExceptionUtils21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils21");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ExceptionUtils22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils22");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ExceptionUtils23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils23");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.String> strList4 = null;
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void ExceptionUtils24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils24");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ExceptionUtils25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils25");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(strList0, (java.util.List<java.lang.String>) strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ExceptionUtils26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils26");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList3, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils27");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<java.lang.String> strList4 = null;
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void ExceptionUtils28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils28");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<java.lang.String> strList1 = null;
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(strList0, strList1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ExceptionUtils29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils29");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils30");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ExceptionUtils31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils31");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in ExceptionUtils generation
        try {
            org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(strList0, (java.util.List<java.lang.String>) strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ExceptionUtils32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils32");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExceptionUtils33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils33");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExceptionUtils34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils34");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ExceptionUtils35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ExceptionUtils0.ExceptionUtils35");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames((java.util.List<java.lang.String>) strList2, (java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

