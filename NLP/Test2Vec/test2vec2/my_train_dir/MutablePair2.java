
package MutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutablePair2 {

    public static boolean debug = false;

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1001");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.Object obj4 = objMutablePair2.getKey();
        java.lang.Object obj5 = objMutablePair2.getLeft();
        java.lang.String str7 = objMutablePair2.toString("(null,(null,(-1,null)))");
        java.lang.CharSequence charSequence8 = objMutablePair2.right;
        java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,(-1,null)))" + "'", str7.equals("(null,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1002");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1003");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1004");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,))");
        java.lang.String str7 = objMutablePair0.toString("(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(null,(-1,null)))" + "'", str7.equals("(-1,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1005");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        objMutablePair3.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair3.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair3.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", objMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!)" + "'", charSequence7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1006");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1007");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1008");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.String str7 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,hi!))" + "'", str7.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1009");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1010");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(a,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10 + "'", obj4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10 + "'", obj9.equals(10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1011");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1012");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1013");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "hi!";
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!)" + "'", str8.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1014");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1015");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1016");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        objMutablePair2.setRight((java.lang.CharSequence) "((null,null),null)");
        objMutablePair2.left = 10L;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1017");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,null)");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1018");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1019");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1020");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Object> objMutablePairMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(objMutablePair0, obj7);
        java.lang.Class<?> wildcardClass9 = objMutablePairMutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(4,null)" + "'", str5.equals("(4,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1021");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "(-1,(null,null))";
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10 + "'", obj4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10 + "'", obj8.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,(null,null))" + "'", charSequence9.equals("(-1,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1022");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(10,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1023");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1024");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "hi!";
        java.lang.String str6 = objMutablePair0.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objEntryMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.Comparable<java.lang.String>) "(4,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1025");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair2.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!)" + "'", charSequence9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1026");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString("(-1,null)");
        java.lang.String str7 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(-1,null)" + "'", str6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1027");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        objMutablePair0.right = "(null,(-1,null))";
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(-1,null))" + "'", charSequence8.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1028");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1029");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setLeft((java.lang.Object) 10.0f);
        objMutablePair0.setRight((java.lang.CharSequence) "((null,null),(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1030");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.left;
        java.lang.CharSequence charSequence6 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.Object obj7 = objMutablePair2.getKey();
        java.lang.String str9 = objMutablePair2.toString("(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str9.equals("(null,(null,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1031");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry0 = null;
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.String> objEntryPair2 = org.apache.commons.lang3.tuple.Pair.of(objEntry0, "(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1032");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.String str5 = objMutablePair0.toString("(null,(null,))");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,(null,))" + "'", str5.equals("(null,(null,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(-1,(-1,null)))" + "'", charSequence8.equals("(null,(-1,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(10.0,(null,(-1,(-1,null))))" + "'", str9.equals("(10.0,(null,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1033");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        objMutablePair0.right = "(4,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1034");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(-1,(-1,null)))" + "'", charSequence8.equals("(null,(-1,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1035");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.getLeft();
        objMutablePair2.right = "(a,(-1,null))";
        objMutablePair2.setRight((java.lang.CharSequence) "(10,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1036");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = null;
        objMutablePair2.setRight(charSequence3);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence6 = objMutablePair5.right;
        java.lang.Object obj7 = objMutablePair5.getKey();
        boolean boolean8 = objMutablePair2.equals(obj7);
        java.lang.Object obj9 = objMutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1037");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.right = "(null,hi!)";
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!)" + "'", charSequence9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1038");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!)" + "'", charSequence7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!)" + "'", charSequence9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1039");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString("(null,null)");
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1040");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,null))" + "'", str7.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1041");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.Object obj3 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1042");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,null)", "(-1,hi!)");
        java.lang.Class<?> wildcardClass3 = charSequencePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1043");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        java.lang.Class<?> wildcardClass5 = charSequence4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1044");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "(a,(-1,null))");
        java.lang.Object obj6 = objMutablePair5.getLeft();
        java.lang.Object obj7 = objMutablePair5.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1045");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.String str5 = objMutablePair2.toString("(null,null)");
        java.lang.Object obj6 = objMutablePair2.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair2.getValue();
        java.lang.Class<?> wildcardClass8 = objMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1046");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.String str5 = objMutablePair0.toString("(null,hi!)");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,hi!)" + "'", str5.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1047");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Class<?> wildcardClass5 = charSequence4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> wildcardClassPair7 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass5, objMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1048");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1049");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        objMutablePair0.right = "(null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1050");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of(obj0, (java.lang.CharSequence) "(null,(null,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1051");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "hi!", (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.getKey();
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        java.lang.Object obj5 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!" + "'", obj5.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1052");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutablePair3.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair3.getRight();
        java.lang.Object obj6 = objMutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1053");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1054");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,(-1,null))" + "'", charSequence7.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1055");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.String str4 = objMutablePair2.toString();
        java.lang.Object obj5 = objMutablePair2.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair2.setValue((java.lang.CharSequence) "(null,(null,(-1,hi!)))");
        java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(a,(-1,null))" + "'", str4.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1056");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass5, "(null,(-1,null))");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objMutablePairPair8 = org.apache.commons.lang3.tuple.Pair.of(objMutablePair0, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1057");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.String str4 = objMutablePair0.toString("(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(-1,null)" + "'", str4.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1058");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        objMutablePair1.left = (byte) 0;
        java.lang.Object obj7 = objMutablePair1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 0 + "'", obj7.equals((byte) 0));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1059");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        objMutablePair0.right = "(10,(null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1060");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.String str4 = objMutablePair0.toString("");
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1061");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutablePair3.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair3.right;
        objMutablePair3.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1062");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1063");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,)");
        java.lang.CharSequence charSequence7 = objMutablePair6.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,)" + "'", charSequence7.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1064");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = null;
        objMutablePair0.right = charSequence5;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1065");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1066");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj7, (java.lang.CharSequence) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1067");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.Object obj4 = objMutablePair2.getLeft();
        objMutablePair2.right = "(a,(-1,null))";
        java.lang.Object obj7 = objMutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 10 + "'", obj4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1068");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.Object obj4 = objMutablePair1.getLeft();
        java.lang.Object obj5 = objMutablePair1.left;
        java.lang.String str6 = objMutablePair1.toString();
        java.lang.Class<?> wildcardClass7 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,(null,null))", wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1069");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(-1,(null,null))", "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1070");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1071");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1072");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        objMutablePair0.right = "(null,(null,(-1,hi!)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1073");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) annotatedElementMutablePair0, "(10.0,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1074");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1075");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.String str5 = objMutablePair3.toString("(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,(-1,null))" + "'", str5.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1076");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.String str9 = objMutablePair0.toString("(null,(null,(-1,(-1,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str9.equals("(null,(null,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1077");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1078");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence5, (java.lang.CharSequence) "(null,(-1,null))");
        java.lang.String str8 = objMutablePair7.toString();
        java.lang.Object obj9 = objMutablePair7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,(-1,null)))" + "'", str8.equals("(null,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1079");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1080");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
        objMutablePair0.setLeft((java.lang.Object) objEntryMutablePair6);
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair2.test1081");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }
}

