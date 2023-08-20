package MutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutablePair0 {

    public static boolean debug = false;

    @Test
    public void MutablePair0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0001");
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
    public void MutablePair0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0002");
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
    public void MutablePair0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0003");
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
    public void MutablePair0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0004");
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
    public void MutablePair0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0005");
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
    public void MutablePair0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0006");
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
    public void MutablePair0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0007");
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
    public void MutablePair0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0008");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0009");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair1.left = 10.0d;
        objMutablePair1.setLeft((java.lang.Object) (byte) -1);
        java.lang.CharSequence charSequence6 = objMutablePair1.getValue();
        objMutablePair0.setLeft((java.lang.Object) charSequence6);
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0010");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair2, (java.lang.CharSequence) "(null,null)");
    }

    @Test
    public void MutablePair0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0011");
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
    public void MutablePair0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0012");
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
    public void MutablePair0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0013");
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
    public void MutablePair0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0014");
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
    public void MutablePair0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0015");
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
    public void MutablePair0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0016");
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
    public void MutablePair0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0017");
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
    public void MutablePair0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0018");
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
    public void MutablePair0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0019");
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
    public void MutablePair0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0020");
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
    public void MutablePair0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0021");
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
    public void MutablePair0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0022");
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
    public void MutablePair0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0023");
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
    public void MutablePair0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0024");
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
    public void MutablePair0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0025");
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
    public void MutablePair0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0026");
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
    public void MutablePair0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0027");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.String> objPair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) ' ', "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair2);
    }

    @Test
    public void MutablePair0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0028");
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
    public void MutablePair0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0029");
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
    public void MutablePair0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0030");
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
    public void MutablePair0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0031");
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
    public void MutablePair0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0032");
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
    public void MutablePair0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0033");
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
    public void MutablePair0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0034");
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
    public void MutablePair0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0035");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Object> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Object>();
    }

    @Test
    public void MutablePair0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0036");
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
    public void MutablePair0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0037");
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
    public void MutablePair0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0038");
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
    public void MutablePair0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0039");
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
    public void MutablePair0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0040");
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
    public void MutablePair0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0041");
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
    public void MutablePair0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0042");
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
    public void MutablePair0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0043");
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
    public void MutablePair0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0044");
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
    public void MutablePair0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0045");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair7 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0046");
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
    public void MutablePair0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0047");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 10, (java.lang.CharSequence) "");
    }

    @Test
    public void MutablePair0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0048");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String>();
    }

    @Test
    public void MutablePair0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0049");
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
    public void MutablePair0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0050");
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
    public void MutablePair0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0051");
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
    public void MutablePair0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0052");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0053");
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
    public void MutablePair0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0054");
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
    public void MutablePair0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0055");
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
    public void MutablePair0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0056");
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
    public void MutablePair0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0057");
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
    public void MutablePair0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0058");
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
    public void MutablePair0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0059");
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
    public void MutablePair0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0060");
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
    public void MutablePair0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0061");
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
    public void MutablePair0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0062");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0063");
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
    public void MutablePair0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0064");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        objMutablePair0.left = objMutablePair5;
    }

    @Test
    public void MutablePair0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0065");
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
    public void MutablePair0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0066");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "(null,(-1,null))", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
    }

    @Test
    public void MutablePair0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0067");
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
    public void MutablePair0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0068");
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
    public void MutablePair0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0069");
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
    public void MutablePair0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0070");
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
    public void MutablePair0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0071");
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
    public void MutablePair0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0072");
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
    public void MutablePair0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0073");
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
    public void MutablePair0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0074");
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
    public void MutablePair0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0075");
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
    public void MutablePair0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0076");
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
    public void MutablePair0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0077");
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
    public void MutablePair0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0078");
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
    public void MutablePair0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0079");
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
    public void MutablePair0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0080");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) "(null,null)", (java.lang.Comparable<java.lang.String>) "(null,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0081");
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
    public void MutablePair0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0082");
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
    public void MutablePair0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0083");
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
    public void MutablePair0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0084");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Comparable<java.lang.String>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("", (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0085");
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
    public void MutablePair0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0086");
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
    public void MutablePair0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0087");
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
    public void MutablePair0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0088");
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
    public void MutablePair0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0089");
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
    public void MutablePair0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0090");
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
    public void MutablePair0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0091");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0092");
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
    public void MutablePair0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0093");
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
    public void MutablePair0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0094");
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
    public void MutablePair0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0095");
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
    public void MutablePair0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0096");
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
    public void MutablePair0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0097");
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
    public void MutablePair0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0098");
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
    public void MutablePair0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0099");
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
    public void MutablePair0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0100");
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
    public void MutablePair0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0101");
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
    public void MutablePair0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0102");
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
    public void MutablePair0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0103");
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
    public void MutablePair0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0104");
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
    public void MutablePair0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0105");
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
    public void MutablePair0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0106");
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
    public void MutablePair0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0107");
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
    public void MutablePair0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0108");
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
    public void MutablePair0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0109");
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
    public void MutablePair0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0110");
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
    public void MutablePair0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0111");
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
    public void MutablePair0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0112");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("", (java.lang.CharSequence) "(null,(-1,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0113");
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
    public void MutablePair0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0114");
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
    public void MutablePair0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0115");
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
    public void MutablePair0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0116");
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
    public void MutablePair0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0117");
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
    public void MutablePair0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0118");
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
    public void MutablePair0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0119");
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
    public void MutablePair0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0120");
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
    public void MutablePair0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0121");
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
    public void MutablePair0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0122");
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
    public void MutablePair0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0123");
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
    public void MutablePair0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0124");
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
    public void MutablePair0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0125");
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
    public void MutablePair0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0126");
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
    public void MutablePair0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0127");
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
    public void MutablePair0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0128");
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
    public void MutablePair0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0129");
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
    public void MutablePair0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0130");
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
    public void MutablePair0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0131");
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
    public void MutablePair0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0132");
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
    public void MutablePair0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0133");
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
    public void MutablePair0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0134");
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
    public void MutablePair0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0135");
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
    public void MutablePair0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0136");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0137");
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
    public void MutablePair0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0138");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,(-1,null))", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0139");
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
    public void MutablePair0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0140");
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
    public void MutablePair0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0141");
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
    public void MutablePair0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0142");
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
    public void MutablePair0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0143");
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
    public void MutablePair0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0144");
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
    public void MutablePair0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0145");
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
    public void MutablePair0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0146");
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
    public void MutablePair0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0147");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) '#', (java.lang.CharSequence) "(-1,(-1,null))");
    }

    @Test
    public void MutablePair0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0148");
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
    public void MutablePair0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0149");
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
    public void MutablePair0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0150");
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
    public void MutablePair0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0151");
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
    public void MutablePair0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0152");
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
    public void MutablePair0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0153");
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
    public void MutablePair0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0154");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0155");
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
    public void MutablePair0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0156");
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
    public void MutablePair0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0157");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.io.Serializable>();
    }

    @Test
    public void MutablePair0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0158");
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
    public void MutablePair0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0159");
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
    public void MutablePair0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0160");
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
    public void MutablePair0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0161");
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
    public void MutablePair0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0162");
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
    public void MutablePair0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0163");
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
    public void MutablePair0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0164");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(null,hi!)");
    }

    @Test
    public void MutablePair0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0165");
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
    public void MutablePair0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0166");
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
    public void MutablePair0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0167");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0168");
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
    public void MutablePair0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0169");
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
    public void MutablePair0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0170");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair0, (java.lang.CharSequence) "(-1,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0171");
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
    public void MutablePair0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0172");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.Object obj3 = null;
        objMutablePair0.setLeft(obj3);
        java.lang.CharSequence charSequence5 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = objMutablePair0.getValue();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0173");
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
    public void MutablePair0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0174");
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
    public void MutablePair0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0175");
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
    public void MutablePair0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0176");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,(-1,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void MutablePair0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0177");
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
    public void MutablePair0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0178");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        java.lang.Object obj5 = objMutablePair0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4' + "'", obj5.equals('4'));
    }

    @Test
    public void MutablePair0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0179");
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
    public void MutablePair0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0180");
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
    public void MutablePair0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0181");
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
    public void MutablePair0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0182");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getValue();
        objMutablePair0.setRight((java.lang.CharSequence) "(-1,null)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair4 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0183");
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
    public void MutablePair0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0184");
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
    public void MutablePair0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0185");
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
    public void MutablePair0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0186");
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
    public void MutablePair0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0187");
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
    public void MutablePair0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0188");
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
    public void MutablePair0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0189");
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
    public void MutablePair0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0190");
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
    public void MutablePair0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0191");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0192");
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
    public void MutablePair0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0193");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Object>();
    }

    @Test
    public void MutablePair0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0194");
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
    public void MutablePair0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0195");
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
    public void MutablePair0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0196");
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
    public void MutablePair0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0197");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Class<?>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(-1,null)", wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0198");
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
    public void MutablePair0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0199");
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
    public void MutablePair0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0200");
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
    public void MutablePair0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0201");
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
    public void MutablePair0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0202");
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
    public void MutablePair0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0203");
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
    public void MutablePair0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0204");
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
    public void MutablePair0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0205");
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
    public void MutablePair0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0206");
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
    public void MutablePair0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0207");
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
    public void MutablePair0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0208");
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
    public void MutablePair0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0209");
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
    public void MutablePair0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0210");
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
    public void MutablePair0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0211");
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
    public void MutablePair0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0212");
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
    public void MutablePair0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0213");
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
    public void MutablePair0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0214");
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
    public void MutablePair0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0215");
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
    public void MutablePair0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0216");
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
    public void MutablePair0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0217");
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
    public void MutablePair0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0218");
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
    public void MutablePair0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0219");
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
    public void MutablePair0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0220");
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
    public void MutablePair0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0221");
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
    public void MutablePair0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0222");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        java.lang.CharSequence charSequence3 = objMutablePair0.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutablePair4.right;
        objMutablePair0.setLeft((java.lang.Object) objMutablePair4);
        java.lang.CharSequence charSequence7 = objMutablePair0.getValue();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0223");
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
    public void MutablePair0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0224");
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
    public void MutablePair0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0225");
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
    public void MutablePair0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0226");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
    }

    @Test
    public void MutablePair0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0227");
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
    public void MutablePair0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0228");
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
    public void MutablePair0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0229");
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
    public void MutablePair0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0230");
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
    public void MutablePair0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0231");
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
    public void MutablePair0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0232");
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
    public void MutablePair0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0233");
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
    public void MutablePair0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0234");
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
    public void MutablePair0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0235");
        java.lang.Class<?> wildcardClass0 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassPair2 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass0, (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair2);
    }

    @Test
    public void MutablePair0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0236");
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
    public void MutablePair0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0237");
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
    public void MutablePair0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0238");
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
    public void MutablePair0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0239");
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
    public void MutablePair0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0240");
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
    public void MutablePair0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0241");
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
    public void MutablePair0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0242");
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
    public void MutablePair0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0243");
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
    public void MutablePair0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0244");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String> objMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Object) (byte) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutablePair2);
    }

    @Test
    public void MutablePair0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0245");
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
    public void MutablePair0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0246");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence> typeMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.Type, java.lang.CharSequence>();
    }

    @Test
    public void MutablePair0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0247");
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
    public void MutablePair0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0248");
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
    public void MutablePair0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0249");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (short) 10, (java.lang.CharSequence) "(null,null)");
        java.lang.CharSequence charSequence4 = objMutablePair2.setValue((java.lang.CharSequence) "(null,null)");
        java.lang.Object obj5 = objMutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null)" + "'", charSequence4.equals("(null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void MutablePair0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0250");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,(-1,null))", (java.lang.Comparable<java.lang.String>) "(a,(-1,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0251");
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
    public void MutablePair0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0252");
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
    public void MutablePair0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0253");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutablePair0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0254");
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
    public void MutablePair0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0255");
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
    public void MutablePair0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0256");
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
    public void MutablePair0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0257");
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
    public void MutablePair0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0258");
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
    public void MutablePair0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0259");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getKey();
        objMutablePair0.right = "(-1,null)";
        objMutablePair0.setLeft((java.lang.Object) 0.0d);
        java.lang.Object obj6 = null;
        objMutablePair0.left = obj6;
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair8 = null;
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0260");
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
    public void MutablePair0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0261");
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
    public void MutablePair0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0262");
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
    public void MutablePair0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0263");
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
    public void MutablePair0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0264");
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
    public void MutablePair0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0265");
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
    public void MutablePair0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0266");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objPairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>, java.io.Serializable>();
    }

    @Test
    public void MutablePair0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0267");
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
    public void MutablePair0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0268");
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
    public void MutablePair0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0269");
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
    public void MutablePair0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0270");
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
    public void MutablePair0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0271");
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
    public void MutablePair0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0272");
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
    public void MutablePair0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0273");
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
    public void MutablePair0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0274");
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
    public void MutablePair0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0275");
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
    public void MutablePair0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0276");
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
    public void MutablePair0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0277");
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
    public void MutablePair0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0278");
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
    public void MutablePair0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0279");
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
    public void MutablePair0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0280");
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
    public void MutablePair0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0281");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.lang.Comparable<java.lang.String>) "(null,hi!)", (java.lang.CharSequence) "(null,null)");
        java.lang.Class<?> wildcardClass3 = strComparableMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0282");
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
    public void MutablePair0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0283");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        objMutablePair0.right = "((null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutablePair0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0284");
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
    public void MutablePair0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0285");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0286");
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
    public void MutablePair0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0287");
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
    public void MutablePair0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0288");
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
    public void MutablePair0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0289");
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
    public void MutablePair0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0290");
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
    public void MutablePair0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0291");
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
    public void MutablePair0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0292");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutablePair0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0293");
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
    public void MutablePair0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0294");
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
    public void MutablePair0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0295");
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
    public void MutablePair0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0296");
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
    public void MutablePair0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0297");
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
    public void MutablePair0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0298");
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
    public void MutablePair0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0299");
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
    public void MutablePair0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0300");
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
    public void MutablePair0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0301");
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
    public void MutablePair0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0302");
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
    public void MutablePair0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0303");
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> objMutablePairMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutablePair0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0304");
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.String> serializableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) (byte) 0, "(null,(null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair2);
    }

    @Test
    public void MutablePair0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0305");
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
    public void MutablePair0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0306");
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
    public void MutablePair0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0307");
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
    public void MutablePair0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0308");
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
    public void MutablePair0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0309");
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
    public void MutablePair0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0310");
        java.lang.reflect.AnnotatedElement annotatedElement1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(-1,hi!)", annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void MutablePair0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0311");
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
    public void MutablePair0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0312");
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
    public void MutablePair0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0313");
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
    public void MutablePair0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0314");
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
    public void MutablePair0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0315");
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
    public void MutablePair0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0316");
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
    public void MutablePair0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0317");
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
    public void MutablePair0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0318");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void MutablePair0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0319");
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
    public void MutablePair0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0320");
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
    public void MutablePair0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0321");
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
    public void MutablePair0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0322");
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
    public void MutablePair0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0323");
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
    public void MutablePair0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0324");
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
    public void MutablePair0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0325");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Class<?>> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Class<?>>();
    }

    @Test
    public void MutablePair0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0326");
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
    public void MutablePair0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0327");
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
    public void MutablePair0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0328");
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
    public void MutablePair0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0329");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.CharSequence> strMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.CharSequence>("(null,(null,null))", (java.lang.CharSequence) "(10,(null,null))");
    }

    @Test
    public void MutablePair0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0330");
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
    public void MutablePair0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0331");
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
    public void MutablePair0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0332");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> strComparableMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0333");
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
    public void MutablePair0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0334");
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
    public void MutablePair0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0335");
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
    public void MutablePair0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0336");
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
    public void MutablePair0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0337");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence>((java.lang.CharSequence) "(null,(-1,null))", (java.lang.CharSequence) "(null,)");
    }

    @Test
    public void MutablePair0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0338");
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
    public void MutablePair0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0339");
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
    public void MutablePair0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0340");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = 10.0d;
        objMutablePair0.setLeft((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass5 = objMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutablePair0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0341");
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
    public void MutablePair0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0342");
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
    public void MutablePair0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0343");
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
    public void MutablePair0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0344");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "(-1,null)");
        java.lang.Class<?> wildcardClass3 = strComparableMutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0345");
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
    public void MutablePair0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0346");
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
    public void MutablePair0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0347");
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
    public void MutablePair0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0348");
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
    public void MutablePair0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0349");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.AnnotatedElement, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutablePair0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0350");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.String> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("((null,null),null)", "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0351");
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
    public void MutablePair0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0352");
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
    public void MutablePair0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0353");
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
    public void MutablePair0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0354");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) 'a', (java.lang.CharSequence) "(-1,null)");
        java.lang.CharSequence charSequence3 = null;
        objMutablePair2.setRight(charSequence3);
        java.lang.CharSequence charSequence5 = objMutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutablePair0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0355");
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
    public void MutablePair0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0356");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(,null)", wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0357");
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
    public void MutablePair0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0358");
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
    public void MutablePair0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0359");
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
    public void MutablePair0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0360");
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
    public void MutablePair0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0361");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair7 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (-1), (java.lang.CharSequence) "(-1,(null,null))");
        int int8 = objMutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>) objMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutablePair0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0362");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, java.io.Serializable>();
    }

    @Test
    public void MutablePair0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0363");
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
    public void MutablePair0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0364");
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
    public void MutablePair0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0365");
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
    public void MutablePair0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0366");
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
    public void MutablePair0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0367");
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
    public void MutablePair0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0368");
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
    public void MutablePair0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0369");
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
    public void MutablePair0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0370");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.CharSequence>((java.lang.CharSequence) "(null,(null,hi!))", (java.lang.CharSequence) "(4,null)");
    }

    @Test
    public void MutablePair0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0371");
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
    public void MutablePair0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0372");
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
    public void MutablePair0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0373");
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
    public void MutablePair0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0374");
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
    public void MutablePair0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0375");
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
    public void MutablePair0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0376");
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
    public void MutablePair0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0377");
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
    public void MutablePair0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0378");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = objMutablePair0.setValue(charSequence3);
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0379");
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
    public void MutablePair0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0380");
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
    public void MutablePair0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0381");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.getLeft();
        java.lang.Object obj2 = objMutablePair0.getLeft();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair3 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj4 = objMutablePair3.getKey();
        java.lang.Object obj5 = objMutablePair3.getLeft();
        boolean boolean6 = objMutablePair0.equals((java.lang.Object) objMutablePair3);
        java.lang.String str7 = objMutablePair0.toString();
        java.lang.CharSequence charSequence8 = objMutablePair0.getRight();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0382");
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
    public void MutablePair0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0383");
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
    public void MutablePair0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0384");
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
    public void MutablePair0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0385");
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
    public void MutablePair0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0386");
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
    public void MutablePair0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0387");
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
    public void MutablePair0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0388");
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
    public void MutablePair0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0389");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0390");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(-1,hi!)", (java.lang.CharSequence) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void MutablePair0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0391");
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
    public void MutablePair0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0392");
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
    public void MutablePair0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0393");
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
    public void MutablePair0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0394");
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
    public void MutablePair0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0395");
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
    public void MutablePair0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0396");
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
    public void MutablePair0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0397");
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
    public void MutablePair0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0398");
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
    public void MutablePair0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0399");
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
    public void MutablePair0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0400");
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
    public void MutablePair0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0401");
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
    public void MutablePair0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0402");
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
    public void MutablePair0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0403");
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
    public void MutablePair0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0404");
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
    public void MutablePair0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0405");
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
    public void MutablePair0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0406");
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
    public void MutablePair0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0407");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0408");
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
    public void MutablePair0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0409");
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
    public void MutablePair0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0410");
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
    public void MutablePair0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0411");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.String str4 = objMutablePair0.toString();
        java.lang.String str6 = objMutablePair0.toString("");
        java.lang.Object obj7 = objMutablePair0.getLeft();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0412");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "");
        objMutablePair2.setRight((java.lang.CharSequence) "(null,hi!)");
        java.lang.Object obj5 = objMutablePair2.getLeft();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0413");
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
    public void MutablePair0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0414");
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
    public void MutablePair0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0415");
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
    public void MutablePair0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0416");
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
    public void MutablePair0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0417");
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
    public void MutablePair0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0418");
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
    public void MutablePair0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0419");
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
    public void MutablePair0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0420");
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
    public void MutablePair0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0421");
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
    public void MutablePair0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0422");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(null,null)", (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass3 = strPair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutablePair0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0423");
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
    public void MutablePair0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0424");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "((null,null),null)", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0425");
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
    public void MutablePair0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0426");
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
    public void MutablePair0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0427");
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
    public void MutablePair0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0428");
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
    public void MutablePair0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0429");
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
    public void MutablePair0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0430");
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
    public void MutablePair0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0431");
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
    public void MutablePair0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0432");
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
    public void MutablePair0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0433");
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
    public void MutablePair0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0434");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        objMutablePair0.left = '4';
        java.lang.CharSequence charSequence3 = objMutablePair0.getRight();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) charSequence3, (java.lang.CharSequence) "(10.0,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0435");
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
    public void MutablePair0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0436");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.Object obj3 = objMutablePair0.getLeft();
        java.lang.Object obj4 = objMutablePair0.getLeft();
        java.lang.Object obj5 = objMutablePair0.getLeft();
        // The following exception was thrown during execution in MutablePair generation
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
    public void MutablePair0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0437");
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
    public void MutablePair0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0438");
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
    public void MutablePair0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0439");
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
    public void MutablePair0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0440");
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
    public void MutablePair0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0441");
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
    public void MutablePair0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0442");
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
    public void MutablePair0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0443");
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
    public void MutablePair0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0444");
        org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> objEntryMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>>();
    }

    @Test
    public void MutablePair0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0445");
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
    public void MutablePair0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0446");
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
    public void MutablePair0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0447");
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
    public void MutablePair0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0448");
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
    public void MutablePair0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0449");
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
    public void MutablePair0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0450");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) (-1), (java.lang.CharSequence) "(-1,(null,null))");
        objMutablePair2.right = "(null,(-1,(-1,null)))";
    }

    @Test
    public void MutablePair0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0451");
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
    public void MutablePair0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0452");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.String>((java.lang.Object) (short) 1, "(null,(null,))");
    }

    @Test
    public void MutablePair0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0453");
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
    public void MutablePair0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0454");
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
    public void MutablePair0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0455");
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
    public void MutablePair0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0456");
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
    public void MutablePair0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0457");
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
    public void MutablePair0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0458");
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
    public void MutablePair0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0459");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("", (java.lang.Comparable<java.lang.String>) "(-1,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0460");
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
    public void MutablePair0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0461");
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
    public void MutablePair0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0462");
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
    public void MutablePair0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0463");
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
    public void MutablePair0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0464");
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
    public void MutablePair0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0465");
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
    public void MutablePair0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0466");
        java.util.Map.Entry<java.lang.Object, java.lang.CharSequence> objEntry1 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.String, java.util.Map.Entry<java.lang.Object, java.lang.CharSequence>> strMutablePair2 = org.apache.commons.lang3.tuple.MutablePair.of("(-1,(null,(-1,null)))", objEntry1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutablePair2);
    }

    @Test
    public void MutablePair0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0467");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        boolean boolean2 = objMutablePair0.equals((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence3 = objMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutablePair0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0468");
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
    public void MutablePair0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0469");
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
    public void MutablePair0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0470");
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
    public void MutablePair0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0471");
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
    public void MutablePair0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0472");
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
    public void MutablePair0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0473");
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
    public void MutablePair0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0474");
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
    public void MutablePair0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0475");
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
    public void MutablePair0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0476");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) "hi!", (java.lang.CharSequence) "(null,null)");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>((java.lang.Object) objMutablePair2, (java.lang.CharSequence) "(null,)");
    }

    @Test
    public void MutablePair0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0477");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence> objPair1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.CharSequence>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(-1,(null,null))", objPair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void MutablePair0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0478");
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
    public void MutablePair0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0479");
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
    public void MutablePair0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0480");
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
    public void MutablePair0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0481");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.io.Serializable> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.io.Serializable>();
    }

    @Test
    public void MutablePair0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0482");
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
    public void MutablePair0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0483");
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
    public void MutablePair0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0484");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void MutablePair0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0485");
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
    public void MutablePair0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0486");
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
    public void MutablePair0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0487");
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
    public void MutablePair0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0488");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutablePair0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0489");
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
    public void MutablePair0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0490");
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
    public void MutablePair0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0491");
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
    public void MutablePair0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0492");
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
    public void MutablePair0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0493");
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
    public void MutablePair0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0494");
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
    public void MutablePair0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0495");
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
    public void MutablePair0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0496");
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
    public void MutablePair0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0497");
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
    public void MutablePair0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0498");
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
    public void MutablePair0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0499");
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
    public void MutablePair0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.MutablePair0500");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence> objMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.Object, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutablePair0.getRight();
        java.lang.CharSequence charSequence2 = objMutablePair0.getValue();
        java.lang.String str3 = objMutablePair0.toString();
        java.lang.Object obj4 = objMutablePair0.getKey();
        java.lang.Object obj5 = objMutablePair0.getKey();
        java.lang.CharSequence charSequence7 = objMutablePair0.setValue((java.lang.CharSequence) "(-1,(-1,null))");
        java.lang.Object obj8 = objMutablePair0.left;
        // The following exception was thrown during execution in MutablePair generation
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

