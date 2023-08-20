
package MutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutablePair0 {

    public static boolean debug = false;

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0001");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.CharSequence> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, (java.lang.CharSequence) "");
        objMutablePair0.setLeft((java.lang.Object) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0002");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0003");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.String str9 = objMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0004");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0005");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        boolean boolean9 = objMutablePair0.equals((java.lang.Object) (byte) 10);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0006");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0007");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null)" + "'", charSequence8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0008");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = obj1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0009");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0010");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair2, (java.lang.CharSequence) "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0011");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0012");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0013");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0014");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0015");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        objMutablePair0.right = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0016");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0017");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0018");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutablePair3.getRight();
        java.lang.CharSequence charSequence5 = objMutablePair3.getValue();
        java.lang.String str6 = objMutablePair3.toString();
        java.lang.Object obj7 = objMutablePair3.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair8 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) objMutablePair3);
        objMutablePair0.left = strPair8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0019");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.String str9 = objMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0020");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        objMutablePair0.right = "(null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0021");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence9 = objMutablePair8.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0022");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        objMutablePair0.setLeft((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0023");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass5, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objEntryMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0024");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) (byte) 0);
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0025");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0026");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0027");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.String> objPair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) ' ', "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0028");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        objMutablePair0.right = "(null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0029");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0030");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.right = "(null,(-1,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0031");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0032");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getLeft();
        java.lang.Object obj3 = objMutablePair1.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj5 = objMutablePair4.getKey();
        java.lang.Object obj6 = objMutablePair4.getLeft();
        boolean boolean7 = objMutablePair1.equals((java.lang.Object) objMutablePair4);
        java.lang.String str8 = objMutablePair1.toString();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> charSequencePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(-1,hi!)", objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0033");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,null))" + "'", str7.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0034");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0035");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Object> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Object>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0036");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0037");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair6 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) objMutablePair1);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence8 = objMutablePair7.right;
        int int9 = objMutablePair1.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0038");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0039");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
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
            System.out.format("%n%s%n", "MutablePair0.test0040");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0041");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0042");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        java.lang.Class<?> wildcardClass7 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.io.Serializable> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.io.Serializable>(obj0, (java.io.Serializable) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = objMutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0043");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.io.Serializable> objMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) objMutablePair0, (java.io.Serializable) 0L);
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0044");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Object obj8 = null;
        objMutablePair0.setLeft(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0045");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objMutablePair4.compareTo(objPair7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0046");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        objMutablePair0.right = "(null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0047");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 10, (java.lang.CharSequence) "");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0048");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0049");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) (byte) 0);
        objMutablePair0.right = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0050");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = null;
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue(charSequence8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0051");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0052");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0053");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.String> strMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.String>();
        objMutablePair0.setLeft((java.lang.Object) strMutablePair7);
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0054");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("(-1,hi!)");
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,hi!)" + "'", str7.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0d + "'", obj8.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0055");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0056");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = (short) -1;
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0057");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj3 = objMutablePair2.getKey();
        objMutablePair2.right = "(-1,null)";
        java.lang.CharSequence charSequence6 = objMutablePair2.right;
        objMutablePair2.right = "hi!";
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPairMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0058");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0059");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0060");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        objMutablePair0.right = "(-1,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0061");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0062");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0063");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0064");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = objMutablePair5;
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0065");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0066");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,(-1,null))", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0067");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair4.getLeft();
        objMutablePair4.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0068");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair4.left = '4';
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0069");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0070");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0071");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.Object obj6 = objMutablePair1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0072");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        objMutablePair0.right = "(null,hi!)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,hi!)" + "'", charSequence6.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0073");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0074");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass3 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass3, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass3);
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparablePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(null,(-1,null))", wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0075");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass2, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = strComparableMutablePair5.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> typeMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.Type) wildcardClass6, objPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0076");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0077");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0078");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass3 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass3, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of(genericDeclaration1, (java.lang.reflect.Type) wildcardClass3);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type>((java.lang.CharSequence) "(null,null)", (java.lang.reflect.Type) wildcardClass3);
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) charSequenceMutablePair7, (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0079");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj9 = objMutablePair8.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "((null,null),null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0080");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) "(null,null)", (java.lang.Comparable<java.lang.String>) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0081");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        objMutablePair0.right = "(-1,hi!)";
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0082");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0083");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0084");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Comparable<java.lang.String>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("", (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0085");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objMutablePairMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
        objMutablePair0.setLeft((java.lang.Object) objMutablePairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0086");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = (short) -1;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(-1,null))" + "'", str8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0087");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0088");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Class<?> wildcardClass3 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair4.left = 10.0d;
        java.lang.Object obj7 = objMutablePair4.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> typeMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.Type) wildcardClass3, objMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0089");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,null)", (java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = strComparableMutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0090");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString();
        boolean boolean9 = objMutablePair0.equals((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0091");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0092");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        objMutablePair0.right = "hi!";
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0093");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0094");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0095");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.String str9 = objMutablePair0.toString("(-1,null)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0096");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        objMutablePair0.right = "(-1,(-1,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0097");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.Object obj9 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0098");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0099");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass3 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass3, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass3);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.AnnotatedElement) wildcardClass3);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.CharSequence) "(-1,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0100");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0101");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null)" + "'", charSequence8.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0102");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.String str9 = objMutablePair0.toString("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0103");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = (short) -1;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(-1,null))" + "'", str8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0104");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0105");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0106");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = null;
        objMutablePair1.right = charSequence6;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,hi!)", (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.Class<?> wildcardClass9 = strComparablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0107");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null)" + "'", charSequence8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0108");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence8 = objMutablePair4.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.Class<?> wildcardClass9 = objMutablePair4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0109");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0110");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.CharSequence> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0111");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration2 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass4 = objMutablePair3.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass4, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of(genericDeclaration2, (java.lang.reflect.Type) wildcardClass4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,null)", (java.lang.reflect.AnnotatedElement) wildcardClass4);
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable>(objEntry0, (java.io.Serializable) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0112");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("", (java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0113");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Class<?> wildcardClass7 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence> typeMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence>((java.lang.reflect.Type) wildcardClass7, (java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0114");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = null;
        objMutablePair1.right = charSequence6;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> strMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>("", objMutablePair1);
        java.lang.String str9 = objMutablePair1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0115");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass5, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objEntryMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.reflect.AnnotatedElement) wildcardClass5);
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
        org.junit.Assert.assertNotNull(wildcardClassMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0116");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        objMutablePair0.setLeft((java.lang.Object) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0117");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0118");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence8 = objMutablePair4.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence9 = objMutablePair4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,hi!)" + "'", charSequence9.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0119");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0120");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.String str9 = objMutablePair0.toString("(10.0,hi!)");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(10.0,hi!)" + "'", str9.equals("(10.0,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0121");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0122");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.String str9 = objMutablePair0.toString("(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,hi!)" + "'", str9.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0123");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0124");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair6 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) objMutablePair1);
        java.lang.Class<?> wildcardClass7 = strPair6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0125");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0126");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0127");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,null))");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0128");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0129");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((null,null),null)" + "'", str9.equals("((null,null),null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0130");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0131");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        objMutablePair0.right = "(null,null)";
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
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,hi!)" + "'", charSequence7.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0132");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.String> strMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.String>();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementPair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass6, (java.io.Serializable) strMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0133");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair0.test0134");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(null,null))" + "'", str8.equals("(-1,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0135");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0136");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0137");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0138");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0139");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("(-1,hi!)");
        java.lang.String str9 = objMutablePair0.toString("(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,hi!)" + "'", str7.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!)" + "'", str9.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0140");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.right = "(null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0141");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0142");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.right = "(-1,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0143");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement3 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1, annotatedElement3);
        java.lang.CharSequence charSequence5 = objMutablePair1.right;
        java.lang.String str6 = objMutablePair1.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.io.Serializable> strMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of("(10.0,hi!)", (java.io.Serializable) str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0144");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        objMutablePair0.setRight((java.lang.CharSequence) "(a,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0145");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        objMutablePair0.right = "(-1,(null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0146");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0147");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) '#', (java.lang.CharSequence) "(-1,(-1,null))");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0148");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = (short) -1;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(-1,null))" + "'", str8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) -1 + "'", obj9.equals((short) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0149");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Object obj9 = objMutablePair0.getKey();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0150");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0151");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null)" + "'", charSequence8.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0152");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0153");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0154");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0155");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        java.lang.Class<?> wildcardClass7 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type>((java.lang.CharSequence) "hi!", (java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0156");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementPair3 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass1, "(null,(-1,null))");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence7 = objMutablePair6.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> typeMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.Type) wildcardClass1, (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0157");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0158");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass5, "(null,(-1,null))");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objMutablePairPair8 = org.apache.commons.lang3.tuple.Pair.of(objMutablePair0, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair0.test0159");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str7 = objMutablePair0.toString();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objMutablePairMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
        boolean boolean9 = objMutablePair0.equals((java.lang.Object) objMutablePairMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10.0,hi!)" + "'", str7.equals("(10.0,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0160");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.reflect.Type type6 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence> typeMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(type6, (java.lang.CharSequence) "(null,null)");
        objMutablePair0.left = type6;
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
        org.junit.Assert.assertNotNull(typeMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0161");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0162");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0163");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0164");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(null,hi!)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0165");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0166");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0167");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0168");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0169");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0170");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0171");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Object obj9 = objMutablePair0.getKey();
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0172");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0173");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence7 = objMutablePair6.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair6.right;
        objMutablePair0.setLeft((java.lang.Object) charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0174");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence9 = objMutablePair8.right;
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,hi!))" + "'", charSequence9.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0175");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0176");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,(-1,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0177");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
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
            System.out.format("%n%s%n", "MutablePair0.test0178");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj5 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4' + "'", obj5.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0179");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        objMutablePair0.right = "(null,(-1,hi!))";
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0180");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        objMutablePair0.right = "(null,)";
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
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0181");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj7, (java.lang.CharSequence) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) -1 + "'", obj7.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0182");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = objMutablePair0.compareTo(objPair4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0183");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.getRight();
        java.lang.CharSequence charSequence6 = objMutablePair4.getValue();
        java.lang.Object obj7 = objMutablePair4.getLeft();
        objMutablePair2.left = obj7;
        java.lang.CharSequence charSequence9 = objMutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "" + "'", charSequence3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0184");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass4 = objMutablePair3.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,null)", (java.lang.reflect.Type) wildcardClass4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass4, "(-1,hi!)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Class<?>> charSequenceMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of(charSequence0, wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0185");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.String str8 = objMutablePair0.toString("");
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0186");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence5 = objMutablePair2.getValue();
        java.lang.Object obj6 = objMutablePair2.getKey();
        objMutablePair2.setRight((java.lang.CharSequence) "(-1,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0187");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) 1.0f, (java.io.Serializable) objMutablePair1);
        java.lang.Object obj6 = objMutablePair1.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0188");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,null)";
        java.lang.String str9 = objMutablePair0.toString("(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0189");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0190");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        java.lang.CharSequence charSequence6 = objMutablePair4.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair4.getValue();
        java.lang.Object obj8 = objMutablePair4.getKey();
        boolean boolean9 = objMutablePair0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0191");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0192");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = (short) -1;
        objMutablePair0.setRight((java.lang.CharSequence) "((null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0193");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Object>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0194");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0195");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.String str5 = objMutablePair0.toString("(null,hi!)");
        java.lang.String str7 = objMutablePair0.toString("(null,hi!)");
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,hi!)" + "'", str5.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0196");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0197");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Class<?>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(-1,null)", wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0198");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.String str4 = objMutablePair2.toString();
        java.lang.Class<?> wildcardClass5 = objMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(a,(-1,null))" + "'", str4.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0199");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10.0,hi!)" + "'", str7.equals("(10.0,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0200");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str8 = objMutablePair0.toString("(-1,null)");
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,null)" + "'", str8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0201");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0202");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.CharSequence> serializablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) objMutablePair0, (java.lang.CharSequence) "(null,null)");
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0203");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0204");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0205");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Object obj9 = objMutablePair0.left;
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0206");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0207");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence8 = null;
        objMutablePair0.right = charSequence8;
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0208");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0209");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        java.lang.String str9 = objMutablePair0.toString("(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(-1,hi!))" + "'", str9.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0210");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(10.0,hi!)");
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0211");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0212");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence6 = objMutablePair5.right;
        java.lang.CharSequence charSequence7 = objMutablePair5.getValue();
        java.lang.Object obj8 = objMutablePair5.left;
        boolean boolean9 = objMutablePair0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0213");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        java.lang.Class<?> wildcardClass7 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.CharSequence) "(a,(-1,null))", (java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0214");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass6, (java.lang.Comparable<java.lang.String>) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementMutablePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0215");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0216");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0217");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair0.getLeft();
        objMutablePair0.right = "(null,(-1,(-1,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0218");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.Class<?> wildcardClass4 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>((java.lang.CharSequence) "(null,(-1,hi!))", (java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = charSequenceMutablePair5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0219");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        objMutablePair1.left = (byte) 0;
        objMutablePair1.right = "hi!";
        java.lang.Class<?> wildcardClass9 = objMutablePair1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0220");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        objMutablePair0.right = "(null,(-1,hi!))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0221");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(-1,hi!))" + "'", str8.equals("(null,(-1,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0222");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0223");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0224");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        objMutablePair0.left = "hi!";
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0225");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,hi!)");
        java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0226");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0227");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0228");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0229");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0230");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getLeft();
        java.lang.Object obj3 = objMutablePair1.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair1.setValue((java.lang.CharSequence) "hi!");
        java.lang.String str7 = objMutablePair1.toString("hi!");
        java.lang.CharSequence charSequence8 = objMutablePair1.getRight();
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryPair9 = org.apache.commons.lang3.tuple.Pair.of(objEntry0, (java.io.Serializable) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0231");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Object> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of(serializable0, (java.lang.Object) charSequence4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence4, (java.lang.CharSequence) "(-1,null)");
        java.lang.String str9 = objMutablePair7.toString("(10.0,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(10.0,hi!)" + "'", str9.equals("(10.0,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0232");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0233");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(10.0,hi!)");
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0234");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objEntryMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>();
        objMutablePair0.setLeft((java.lang.Object) objEntryMutablePair6);
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0235");
        java.lang.Class<?> wildcardClass0 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassPair2 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass0, (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0236");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        java.lang.Class<?> wildcardClass4 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0237");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Class<?> wildcardClass7 = objMutablePair0.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement8 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationPair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass7, annotatedElement8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0238");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = null;
        objMutablePair3.left = obj4;
        java.lang.String str6 = objMutablePair3.toString();
        java.lang.String str8 = objMutablePair3.toString("(null,(-1,null))");
        java.lang.Object obj9 = objMutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,)" + "'", str6.equals("(null,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(-1,null))" + "'", str8.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0239");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence8 = objMutablePair4.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence9 = objMutablePair4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,hi!)" + "'", charSequence9.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0240");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("(null,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,(-1,(-1,null)))" + "'", str4.equals("(null,(-1,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0241");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.String str7 = objMutablePair0.toString("(a,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(a,(-1,null))" + "'", str7.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0242");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj3 = objMutablePair2.getLeft();
        java.lang.Object obj4 = objMutablePair2.getKey();
        java.lang.CharSequence charSequence5 = objMutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a' + "'", obj3.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0243");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
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
            System.out.format("%n%s%n", "MutablePair0.test0244");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) (byte) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0245");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10 + "'", obj4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0246");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0247");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString("");
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0248");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Object obj9 = objMutablePair0.left;
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0249");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence4 = objMutablePair2.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.Object obj5 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0250");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,(-1,null))", (java.lang.Comparable<java.lang.String>) "(a,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0251");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0252");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.right = "(4,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0253");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0254");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0255");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.Object obj9 = objMutablePair0.left;
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
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0256");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.String str5 = objMutablePair2.toString();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair6 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) 1.0f, (java.io.Serializable) objMutablePair2);
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) "(10.0,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair2);
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objMutablePairMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of(objMutablePair2, (java.lang.Comparable<java.lang.String>) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePairMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0257");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str5 = objMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0258");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass5, "(null,(-1,null))");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> objMutablePairPair8 = org.apache.commons.lang3.tuple.Pair.of(objMutablePair0, (java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.lang.Class<?> wildcardClass9 = objMutablePairPair8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0259");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = objMutablePair0.compareTo(objPair8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0260");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0261");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair2.right = "hi!";
        java.lang.Class<?> wildcardClass5 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.String> typePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.Type) wildcardClass5, "(4,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0262");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.io.Serializable serializable3 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, serializable3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0263");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj3 = objMutablePair2.left;
        java.lang.CharSequence charSequence4 = objMutablePair2.getValue();
        java.lang.String str5 = objMutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short) 10 + "'", obj3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(10,(null,null))" + "'", str5.equals("(10,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0264");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str5 = objMutablePair1.toString();
        java.lang.CharSequence charSequence6 = objMutablePair1.getRight();
        objMutablePair1.left = "";
        java.lang.String str9 = objMutablePair1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,null)" + "'", str9.equals("(,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0265");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Class<?> wildcardClass7 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.Type) wildcardClass7, (java.lang.Comparable<java.lang.String>) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0266");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.io.Serializable>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0267");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,hi!)" + "'", charSequence8.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0268");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0269");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        objMutablePair0.right = "hi!";
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0270");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry7 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> serializableMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, objEntry7);
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0271");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0272");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair6 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) objMutablePair1);
        java.lang.CharSequence charSequence7 = objMutablePair1.getValue();
        java.lang.String str9 = objMutablePair1.toString("(null,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(-1,(-1,null)))" + "'", str9.equals("(null,(-1,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0273");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0274");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        objMutablePair0.right = "(10,(null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0275");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = '4';
        objMutablePair1.right = "(null,null)";
        java.lang.String str7 = objMutablePair1.toString("(null,(-1,null))");
        java.lang.Class<?> wildcardClass8 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Class<?>> strMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,hi!)", wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(-1,null))" + "'", str7.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0276");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,hi!)" + "'", str8.equals("(-1,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0277");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0278");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass3 = objMutablePair2.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass3, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMutablePair6 = org.apache.commons.lang3.tuple.MutablePair.of(genericDeclaration1, (java.lang.reflect.Type) wildcardClass3);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(-1,null)", (java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.Class<?> wildcardClass8 = strComparableMutablePair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0279");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0280");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,null)");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0281");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.lang.Comparable<java.lang.String>) "(null,hi!)", (java.lang.CharSequence) "(null,null)");
        java.lang.Class<?> wildcardClass3 = strComparableMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0282");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0283");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        objMutablePair0.right = "((null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0284");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0285");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0286");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence8 = objMutablePair7.getValue();
        boolean boolean9 = objMutablePair0.equals((java.lang.Object) charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0287");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0288");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.String str9 = objMutablePair0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0289");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "";
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(a,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0290");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0291");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence2 = objMutablePair0.getRight();
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.Object obj4 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0292");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0293");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0294");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        objMutablePair0.right = "(null,null)";
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
            System.out.format("%n%s%n", "MutablePair0.test0295");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = null;
        objMutablePair1.right = charSequence6;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,hi!)", (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.String str9 = objMutablePair1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0296");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.right = "hi!";
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0297");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0298");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,)");
        java.lang.String str4 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,(null,))" + "'", str4.equals("(null,(null,))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0299");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        objMutablePair0.right = "(null,(-1,null))";
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,)");
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,null))" + "'", charSequence9.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0300");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,(-1,null))" + "'", charSequence8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0301");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.left;
        objMutablePair0.right = "(null,)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0302");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(null,(-1,null)))" + "'", str8.equals("(-1,(null,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0303");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0304");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) (byte) 0, "(null,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0305");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.right = "(-1,(-1,null))";
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(-1,(-1,null)))" + "'", str8.equals("(null,(-1,(-1,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0306");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.String str5 = objMutablePair2.toString("(null,null)");
        java.lang.Object obj6 = objMutablePair2.getKey();
        objMutablePair2.setRight((java.lang.CharSequence) "(4,null)");
        java.lang.Object obj9 = objMutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 10 + "'", obj9.equals((short) 10));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0307");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.String str9 = objMutablePair0.toString("(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0308");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0309");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 0 + "'", obj8.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0310");
        java.lang.reflect.AnnotatedElement annotatedElement1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(-1,hi!)", annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0311");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.left;
        objMutablePair0.right = "(10.0,hi!)";
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.Type) wildcardClass6, (java.lang.Comparable<java.lang.String>) "(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0312");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.String str8 = objMutablePair0.toString("(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!)" + "'", str8.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0313");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0314");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = null;
        objMutablePair1.right = charSequence6;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> strMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>("", objMutablePair1);
        java.lang.Object obj9 = objMutablePair1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0315");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.String str7 = objMutablePair0.toString("(,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,null)" + "'", str7.equals("(,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0316");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        objMutablePair2.setRight((java.lang.CharSequence) "((null,null),null)");
        objMutablePair2.right = "(a,(-1,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0317");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4' + "'", obj7.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(4,(null,null))" + "'", str8.equals("(4,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0318");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0319");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0320");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.Object obj4 = objMutablePair1.getLeft();
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparablePair5 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(null,(null,))", obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0321");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0322");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0323");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        objMutablePair0.right = "(,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0324");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,hi!)");
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0325");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Class<?>> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0326");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Object> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of(serializable0, (java.lang.Object) charSequence4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence4, (java.lang.CharSequence) "(-1,null)");
        java.lang.String str9 = objMutablePair7.toString("(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0327");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.String str3 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,(-1,null))" + "'", str3.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0328");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.String str6 = objMutablePair0.toString();
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
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null)" + "'", str6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0329");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.CharSequence> strMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.CharSequence>("(null,(null,null))", (java.lang.CharSequence) "(10,(null,null))");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0330");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutablePair0.equals(obj7);
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0331");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        objMutablePair4.right = "(null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0332");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0333");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0334");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "");
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0335");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0336");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0337");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence>((java.lang.CharSequence) "(null,(-1,null))", (java.lang.CharSequence) "(null,)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0338");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,null)");
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0339");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0340");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0341");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) ' ', (java.lang.CharSequence) "(null,)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.getRight();
        java.lang.CharSequence charSequence6 = objMutablePair4.getValue();
        java.lang.String str7 = objMutablePair4.toString();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) 1.0f, (java.io.Serializable) objMutablePair4);
        boolean boolean9 = objMutablePair2.equals((java.lang.Object) objMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0342");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Class<?> wildcardClass8 = objMutablePair0.getClass();
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0343");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.Object obj9 = objMutablePair8.getLeft();
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0344");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "(-1,null)");
        java.lang.Class<?> wildcardClass3 = strComparableMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0345");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.String str9 = objMutablePair0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0346");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.String> objPair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) wildcardClass6, "(4,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0347");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0348");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0349");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0350");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.String> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("((null,null),null)", "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0351");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        objMutablePair0.right = "";
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.Class<?> wildcardClass9 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0352");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.CharSequence> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) objMutablePair0, (java.lang.CharSequence) "");
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) -1 + "'", obj9.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0353");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.String str7 = objMutablePair0.toString("(10,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10,(null,null))" + "'", str7.equals("(10,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0354");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = null;
        objMutablePair2.setRight(charSequence3);
        java.lang.CharSequence charSequence5 = objMutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0355");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!)" + "'", str6.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0356");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(,null)", wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0357");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        objMutablePair0.right = "(null,(-1,null))";
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.io.Serializable) "(null,hi!)");
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
        org.junit.Assert.assertNotNull(objEntryMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0358");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0359");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        boolean boolean7 = objMutablePair0.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence8 = objMutablePair0.getValue();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,null)" + "'", str9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0360");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str7 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0361");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (-1), (java.lang.CharSequence) "(-1,(null,null))");
        int int8 = objMutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0362");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0363");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getKey();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of(obj2, (java.lang.Comparable<java.lang.String>) "(10.0,hi!)");
        java.lang.Class<?> wildcardClass5 = objMutablePair4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type> charSequenceMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.reflect.Type>((java.lang.CharSequence) "(-1,null)", (java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0364");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutablePair0.equals(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0365");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0366");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj5 = objMutablePair2.getLeft();
        java.lang.String str7 = objMutablePair2.toString("");
        objMutablePair2.right = "(-1,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0367");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,)");
        java.lang.Object obj7 = objMutablePair6.getKey();
        java.lang.String str8 = objMutablePair6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,))" + "'", str8.equals("(null,(null,))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0368");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(4,null)" + "'", str5.equals("(4,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0369");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(a,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0370");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence>((java.lang.CharSequence) "(null,(null,hi!))", (java.lang.CharSequence) "(4,null)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0371");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0372");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.Object obj7 = objMutablePair0.left;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4' + "'", obj7.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(4,(null,null))" + "'", str8.equals("(4,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null)" + "'", charSequence9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0373");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.Object obj6 = objMutablePair0.left;
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
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0374");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        java.lang.String str2 = objMutablePair0.toString();
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null)" + "'", str2.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0375");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence5 = objMutablePair2.getValue();
        java.lang.Object obj6 = objMutablePair2.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair2.getValue();
        java.lang.String str8 = objMutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(-1,null)" + "'", charSequence7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(a,(-1,null))" + "'", str8.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0376");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.right = "(null,hi!)";
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,hi!))" + "'", str9.equals("(null,(null,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0377");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "");
        java.lang.String str7 = objMutablePair0.toString("(-1,(-1,null))");
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(-1,null))" + "'", str7.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0378");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue(charSequence3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = charSequence4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0379");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0380");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair3.toString();
        java.lang.Class<?> wildcardClass8 = objMutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0381");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0382");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,null))" + "'", charSequence9.equals("(null,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0383");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        java.lang.Object obj5 = objMutablePair1.getKey();
        objMutablePair1.right = "(-1,(-1,null))";
        java.lang.CharSequence charSequence8 = objMutablePair1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,(-1,null))" + "'", charSequence8.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0384");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "");
        objMutablePair0.right = "(null,null)";
        java.lang.Class<?> wildcardClass6 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0385");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = null;
        objMutablePair0.right = charSequence5;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,null)" + "'", str7.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0386");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString("(-1,(null,null))");
        java.lang.String str9 = objMutablePair0.toString("(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(null,null))" + "'", str7.equals("(-1,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,hi!)" + "'", str9.equals("(-1,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0387");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) 10);
        java.lang.String str5 = objMutablePair0.toString("(null,hi!)");
        java.lang.String str7 = objMutablePair0.toString("(null,hi!)");
        java.lang.String str9 = objMutablePair0.toString("(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,hi!)" + "'", str5.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,(null,(-1,null)))" + "'", str9.equals("(-1,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0388");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.left;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0389");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0390");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(-1,hi!)", (java.lang.CharSequence) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0391");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.String str8 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10.0,hi!)" + "'", str7.equals("(10.0,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10.0,hi!)" + "'", str8.equals("(10.0,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0392");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        objMutablePair0.right = "(null,(-1,hi!))";
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
            System.out.format("%n%s%n", "MutablePair0.test0393");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.Object> serializableMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) "(-1,hi!)", (java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0394");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        java.lang.Class<?> wildcardClass6 = objMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0395");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.Object obj6 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4' + "'", obj5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4' + "'", obj6.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0396");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4' + "'", obj6.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0397");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = (short) -1;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(-1,null))" + "'", str8.equals("(-1,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,(-1,null))" + "'", str9.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0398");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0399");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair1.right;
        java.lang.Class<?> wildcardClass6 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Class<?>> charSequencePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,(null,hi!))", wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0400");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = null;
        objMutablePair0.right = charSequence7;
        java.lang.CharSequence charSequence9 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0401");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "(4,(null,null))");
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0402");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getLeft();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", str8.equals("(null,(null,(-1,(-1,null))))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0403");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        objMutablePair1.left = (byte) 0;
        java.lang.Class<?> wildcardClass7 = objMutablePair1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0404");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str4 = objMutablePair0.toString("hi!");
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.String str8 = objMutablePair0.toString("(10.0,hi!)");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10.0,hi!)" + "'", str8.equals("(10.0,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0405");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null)" + "'", charSequence5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null)" + "'", charSequence6.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null)" + "'", charSequence7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0406");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj3, charSequence5);
        java.lang.String str7 = objMutablePair6.toString();
        java.lang.Object obj8 = objMutablePair6.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0407");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0408");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair0.test0409");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.Object obj5 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0410");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.right = "(null,hi!)";
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,hi!)" + "'", charSequence6.equals("(null,hi!)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0411");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0412");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj5 = objMutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0413");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.getLeft();
        java.lang.Object obj9 = objMutablePair0.getKey();
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0414");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair8 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "((null,null),null)");
        java.lang.CharSequence charSequence9 = objMutablePair8.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "((null,null),null)" + "'", charSequence9.equals("((null,null),null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0415");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("((null,null),null)");
        java.lang.String str5 = objMutablePair0.toString("(-1,(null,null))");
        java.lang.Object obj6 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((null,null),null)" + "'", str3.equals("((null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(-1,(null,null))" + "'", str5.equals("(-1,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0416");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        objMutablePair0.right = "(null,(-1,null))";
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0417");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.getKey();
        objMutablePair0.setRight((java.lang.CharSequence) "(a,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0418");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.left;
        objMutablePair0.right = "(10.0,hi!)";
        objMutablePair0.setRight((java.lang.CharSequence) "(null,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair9 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(null,(null,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0419");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = null;
        objMutablePair3.left = obj4;
        java.lang.String str6 = objMutablePair3.toString();
        java.lang.String str8 = objMutablePair3.toString("(-1,(null,(-1,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,)" + "'", str6.equals("(null,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(-1,(null,(-1,null)))" + "'", str8.equals("(-1,(null,(-1,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0420");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.CharSequence charSequence7 = null;
        objMutablePair0.right = charSequence7;
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0421");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,hi!)", (org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair1);
        objMutablePair1.left = (byte) 0;
        java.lang.Object obj7 = objMutablePair1.left;
        java.lang.CharSequence charSequence8 = objMutablePair1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 0 + "'", obj7.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0422");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(null,null)", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass3 = strPair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0423");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.CharSequence charSequence7 = objMutablePair0.getRight();
        java.lang.Object obj8 = objMutablePair0.getKey();
        java.lang.Object obj9 = objMutablePair0.getLeft();
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0424");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "((null,null),null)", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0425");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.Object obj8 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0426");
        java.lang.Class<?> wildcardClass0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj4 = objMutablePair3.getLeft();
        java.lang.Object obj5 = objMutablePair3.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> wildcardClassPair6 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        objMutablePair3.setRight((java.lang.CharSequence) "(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0427");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.Object obj8 = objMutablePair0.left;
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
            System.out.format("%n%s%n", "MutablePair0.test0428");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence2 = objMutablePair0.right;
        java.lang.Object obj3 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.setValue((java.lang.CharSequence) "");
        java.lang.String str7 = objMutablePair0.toString("(-1,(-1,null))");
        objMutablePair0.right = "(-1,(null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(-1,null))" + "'", str7.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0429");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.Object obj9 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0430");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.Object obj6 = objMutablePair0.getLeft();
        java.lang.String str8 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0431");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str5 = objMutablePair0.toString("(,null)");
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,null)" + "'", str5.equals("(,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0432");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        objMutablePair0.setLeft((java.lang.Object) (byte) 0);
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0433");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.Object obj4 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "(null,)");
        objMutablePair6.setRight((java.lang.CharSequence) "(,null)");
        java.lang.Object obj9 = objMutablePair6.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0434");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence3, (java.lang.CharSequence) "(10.0,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0435");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        java.lang.CharSequence charSequence4 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0436");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0437");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0438");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getLeft();
        java.lang.Object obj3 = objMutablePair1.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair1.setValue((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair1.right;
        java.lang.CharSequence charSequence8 = objMutablePair1.setValue((java.lang.CharSequence) "(null,(-1,hi!))");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.io.Serializable> objPair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) false, (java.io.Serializable) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0439");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0440");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = '4';
        java.lang.Object obj4 = null;
        objMutablePair1.setLeft(obj4);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        java.lang.Class<?> wildcardClass7 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.reflect.Type> charSequencePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))", (java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0441");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair6 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) objMutablePair1);
        java.lang.CharSequence charSequence7 = objMutablePair1.getValue();
        java.lang.String str8 = objMutablePair1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0442");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.CharSequence charSequence5 = objMutablePair0.getRight();
        java.lang.Object obj6 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(null,(-1,(-1,null))))");
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
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
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(null,(-1,(-1,null))))" + "'", charSequence9.equals("(null,(null,(-1,(-1,null))))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0443");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.String str5 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0444");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0445");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.left;
        java.lang.Object obj5 = objMutablePair0.left;
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,(-1,null)))");
        java.lang.String str9 = objMutablePair0.toString("(10,(null,null))");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(10,(null,null))" + "'", str9.equals("(10,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0446");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.String str5 = objMutablePair2.toString("(null,null)");
        java.lang.Object obj6 = objMutablePair2.getKey();
        java.lang.Object obj7 = objMutablePair2.getLeft();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(null,null)" + "'", charSequence3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0447");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.right = "(null,null)";
        java.lang.String str6 = objMutablePair0.toString("(null,(-1,null))");
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.Object obj8 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(-1,null))" + "'", str6.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(4,(null,null))" + "'", str7.equals("(4,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0448");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Object obj8 = null;
        objMutablePair0.left = obj8;
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
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0449");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0450");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (-1), (java.lang.CharSequence) "(-1,(null,null))");
        objMutablePair2.right = "(null,(-1,(-1,null)))";
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0451");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = null;
        objMutablePair2.setRight(charSequence4);
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.CharSequence charSequence8 = objMutablePair2.getValue();
        java.lang.Class<?> wildcardClass9 = objMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!)" + "'", charSequence8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0452");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String>((java.lang.Object) (short) 1, "(null,(null,))");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0453");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.String str8 = objMutablePair0.toString("(a,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(a,(-1,null))" + "'", str8.equals("(a,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0454");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        java.lang.CharSequence charSequence4 = objMutablePair1.getValue();
        java.lang.CharSequence charSequence5 = objMutablePair1.right;
        objMutablePair1.setRight((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> genericDeclarationMutablePair8 = org.apache.commons.lang3.tuple.MutablePair.of(genericDeclaration0, objMutablePair1);
        java.lang.CharSequence charSequence9 = objMutablePair1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0455");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.Object obj8 = null;
        boolean boolean9 = objMutablePair0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj7.toString(), "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0456");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMutablePair6 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.Object>();
        objMutablePair0.setLeft((java.lang.Object) annotatedElementMutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0457");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,hi!)");
        java.lang.Object obj8 = objMutablePair0.left;
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(-1,hi!))" + "'", str9.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0458");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.CharSequence charSequence8 = objMutablePair0.right;
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0459");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("", (java.lang.Comparable<java.lang.String>) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0460");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0461");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,null))");
        java.lang.Object obj9 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(-1,null)" + "'", charSequence5.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,null)" + "'", charSequence8.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0462");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(null,null))");
        java.lang.String str9 = objMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(-1,(-1,(null,null)))" + "'", str9.equals("(-1,(-1,(null,null)))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0463");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass2 = objMutablePair1.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of(wildcardClass2, (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMutablePair5 = org.apache.commons.lang3.tuple.MutablePair.of(genericDeclaration0, (java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = genericDeclarationMutablePair5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0464");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        objMutablePair0.right = "hi!";
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.String str8 = objMutablePair0.toString();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!)" + "'", str8.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0465");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        java.lang.Object obj8 = null;
        objMutablePair0.left = obj8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0466");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,(null,(-1,null)))", objEntry1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0467");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0468");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = objMutablePair0.getKey();
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence> objPairMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.CharSequence>((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.CharSequence) "(-1,hi!)");
        java.lang.CharSequence charSequence6 = objMutablePair0.right;
        java.lang.Object obj7 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '4' + "'", obj3.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4' + "'", obj7.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0469");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = null;
        objMutablePair3.left = obj4;
        java.lang.String str6 = objMutablePair3.toString();
        java.lang.String str8 = objMutablePair3.toString("(null,(-1,null))");
        java.lang.String str9 = objMutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,)" + "'", str6.equals("(null,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(-1,null))" + "'", str8.equals("(null,(-1,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,)" + "'", str9.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0470");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence6 = objMutablePair0.setValue((java.lang.CharSequence) "hi!");
        java.lang.Object obj7 = objMutablePair0.getKey();
        java.lang.String str9 = objMutablePair0.toString("(null,null)");
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
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null)" + "'", str9.equals("(null,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0471");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.left = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0472");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0473");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence8 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(null,null))");
        java.lang.CharSequence charSequence9 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,(null,null))" + "'", charSequence9.equals("(-1,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0474");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj5 = objMutablePair2.getLeft();
        java.lang.String str7 = objMutablePair2.toString("");
        objMutablePair2.right = "(null,(-1,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0475");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,(-1,hi!))");
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(-1,hi!))" + "'", charSequence9.equals("(null,(-1,hi!))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0476");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "hi!", (java.lang.CharSequence) "(null,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair2, (java.lang.CharSequence) "(null,)");
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0477");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,(null,null))", objPair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0478");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.Object obj7 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0479");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutablePair1.getRight();
        java.lang.CharSequence charSequence3 = objMutablePair1.getValue();
        java.lang.String str4 = objMutablePair1.toString();
        java.lang.Object obj5 = objMutablePair1.left;
        java.lang.Object obj6 = objMutablePair1.left;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.io.Serializable> objMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) (short) 10, (java.io.Serializable) objMutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null)" + "'", str4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair7);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0480");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objPair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) annotatedElementMutablePair0, (java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair3);
        java.lang.Object obj5 = objMutablePair3.getLeft();
        java.lang.String str6 = objMutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(a,(-1,null))" + "'", str6.equals("(a,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0481");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.io.Serializable> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.io.Serializable>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0482");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.CharSequence charSequence6 = objMutablePair0.getRight();
        java.lang.Object obj7 = objMutablePair0.getLeft();
        java.lang.CharSequence charSequence9 = objMutablePair0.setValue((java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(-1,null)" + "'", charSequence6.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(-1,null)" + "'", charSequence9.equals("(-1,null)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0483");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        objMutablePair0.setRight((java.lang.CharSequence) "(null,hi!)");
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,(-1,null))");
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null)" + "'", str3.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(-1,(-1,null))" + "'", charSequence8.equals("(-1,(-1,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0484");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0485");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.String str6 = objMutablePair0.toString();
        java.lang.CharSequence charSequence7 = objMutablePair0.right;
        java.lang.Object obj8 = objMutablePair0.left;
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0486");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.String str3 = objMutablePair0.toString("hi!");
        objMutablePair0.setRight((java.lang.CharSequence) "hi!");
        objMutablePair0.right = "";
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence9 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0487");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.right;
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.left;
        objMutablePair0.right = "(10.0,hi!)";
        objMutablePair0.setRight((java.lang.CharSequence) "(null,null)");
        objMutablePair0.right = "(null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0488");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0489");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutablePair2.getRight();
        java.lang.CharSequence charSequence4 = objMutablePair2.right;
        java.lang.String str5 = objMutablePair2.toString();
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        boolean boolean8 = objMutablePair0.equals((java.lang.Object) objMutablePair2);
        java.lang.Object obj9 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0490");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.io.Serializable serializable3 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, serializable3);
        java.lang.Class<?> wildcardClass5 = objEntryMutablePair4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0491");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutablePair1.getLeft();
        java.lang.Object obj3 = objMutablePair1.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj5 = objMutablePair4.getKey();
        java.lang.Object obj6 = objMutablePair4.getLeft();
        boolean boolean7 = objMutablePair1.equals((java.lang.Object) objMutablePair4);
        java.lang.String str8 = objMutablePair4.toString();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of(strComparable0, (java.io.Serializable) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null)" + "'", str8.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0492");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.String> objPairMutablePair4 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, "");
        java.lang.Object obj5 = objMutablePair0.left;
        java.lang.String str7 = objMutablePair0.toString("(null,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> objEntryMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>) objMutablePair0, (java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4' + "'", obj5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!)" + "'", str7.equals("(null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objEntryMutablePair9);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0493");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.Object obj6 = objMutablePair0.left;
        java.lang.String str8 = objMutablePair0.toString("(4,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(4,(null,null))" + "'", str8.equals("(4,(null,null))"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0494");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence5 = objMutablePair0.right;
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        java.lang.CharSequence charSequence8 = null;
        objMutablePair0.setRight(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0495");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = objMutablePair2.right;
        java.lang.CharSequence charSequence4 = objMutablePair2.getRight();
        objMutablePair2.setRight((java.lang.CharSequence) "((null,null),null)");
        java.lang.String str8 = objMutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "(-1,null)" + "'", charSequence3.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(-1,null)" + "'", charSequence4.equals("(-1,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0496");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj1, (java.lang.CharSequence) "");
        java.lang.Object obj4 = null;
        objMutablePair3.left = obj4;
        java.lang.String str6 = objMutablePair3.toString();
        java.lang.CharSequence charSequence7 = objMutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,)" + "'", str6.equals("(null,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0497");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        java.lang.Object obj4 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '4' + "'", obj4.equals('4'));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0498");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        java.lang.reflect.AnnotatedElement annotatedElement2 = null;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objPairMutablePair3 = org.apache.commons.lang3.tuple.MutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair0, annotatedElement2);
        java.lang.CharSequence charSequence4 = objMutablePair0.right;
        java.lang.String str5 = objMutablePair0.toString();
        java.lang.String str7 = objMutablePair0.toString("(-1,(null,null))");
        java.lang.String str9 = objMutablePair0.toString("(null,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPairMutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null)" + "'", str5.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,(null,null))" + "'", str7.equals("(-1,(null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,)" + "'", str9.equals("(null,)"));
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0499");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        java.lang.Object obj4 = objMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test0500");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        java.lang.Object obj8 = objMutablePair0.left;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }
}

